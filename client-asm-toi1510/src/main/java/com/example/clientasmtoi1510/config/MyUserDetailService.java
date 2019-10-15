package com.example.clientasmtoi1510.config;

import com.example.clientasmtoi1510.service.HelloWorld;
import com.example.clientasmtoi1510.service.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.rmi.RemoteException;

public class MyUserDetailService implements UserDetailsService {
    @Autowired
    HelloWorld helloWorld;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Member member = null;
        try {
            member = helloWorld.findMemberByUsername(username);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        if(member==null){
            throw new UsernameNotFoundException("User not found");
        }

        return User.builder()
                .username(member.getUsername())
                .password(member.getPassword())
                .roles(member.getRole())
                .build();
    }
}
