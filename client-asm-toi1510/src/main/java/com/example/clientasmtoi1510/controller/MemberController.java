package com.example.clientasmtoi1510.controller;

import com.example.clientasmtoi1510.service.HelloWorld;
import com.example.clientasmtoi1510.service.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.rmi.RemoteException;
import java.util.Calendar;

@Controller
@RequestMapping(value = "/members")
public class MemberController {
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    HelloWorld helloWorld;
    @RequestMapping(method = RequestMethod.GET, value = "/login")
    public String showLoginPage() {
        return "login";
    }
    @GetMapping(value = "/create")
    public String createMember(Model model){
        model.addAttribute("member",new Member());
        return "member/form";
    }
    @PostMapping(value = "/create")
    public String addMember(Member member) throws RemoteException {
        member.setRole("TRAVELER");
        member.setPassword(passwordEncoder.encode(member.getPassword()));
        member.setCreatedAt(Calendar.getInstance().getTimeInMillis());
        member.setUpdatedAt(Calendar.getInstance().getTimeInMillis());
        helloWorld.addMember(member);
        return "success";
    }
}
