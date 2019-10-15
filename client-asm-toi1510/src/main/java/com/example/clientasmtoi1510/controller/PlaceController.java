package com.example.clientasmtoi1510.controller;

import com.example.clientasmtoi1510.service.HelloWorld;
import com.example.clientasmtoi1510.service.Place;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.rmi.RemoteException;

@Controller
@RequestMapping(value = "/places")
public class PlaceController {
    @Autowired
    HelloWorld helloWorld;
    //list place
    @GetMapping(value = "/list")
    public String getAllPlace(Model model) throws RemoteException {
        model.addAttribute("list",helloWorld.getAllPlace());
        return "place/list";
    }
    //add place
    @GetMapping(value = "/add")
    public String showForm(Model model) throws RemoteException {
        model.addAttribute("place",new Place());
        model.addAttribute("cities",helloWorld.getAllCity());
        return "place/form";
    }
    @PostMapping(value = "/add")
    public String addPlace(Place place) throws RemoteException {
        helloWorld.savePlace(place);
        return "redirect:/places/list";
    }
    //edit place
    @GetMapping(value = "/edit/{id}")
    public String showInfoEdit(@PathVariable("id") long id,Model model) throws RemoteException {
        Place place = helloWorld.findPlaceByID(id);
        model.addAttribute("place",place);
        model.addAttribute("districts",helloWorld.getAllDistrict());
        model.addAttribute("cities",helloWorld.getAllCity());
        return "place/edit";
    }
    @PostMapping(value = "/update")
    public String updatePlace(Place place) throws RemoteException {
        helloWorld.updatePlace(place);
        return "redirect:/places/list";
    }

    //delete place
    @GetMapping(value = "/delete/{id}")
    public String deletePlace(@PathVariable("id") long id) throws RemoteException {
        helloWorld.deletePlace(id);
        return "redirect:/places/list";
    }
}
