package com.example.RegisterUser.controller;

import com.example.RegisterUser.model.RgUser;
import com.example.RegisterUser.service.RgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

public class RgController {

    @Autowired
    private RgService service;
    
    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<RgUser> listUsers = service.listAll();
        model.addAttribute("listuser", listUsers);
        return "index";
    }
    	
    @GetMapping("/new")
    public String addContactPage(Model model) {
        model.addAttribute("user", new RgUser());
        return "new";
    }

    @PostMapping("/save")
    public String saveUser(@ModelAttribute("user") RgUser user) {
        service.save(user);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String showEditUserForm(@PathVariable("id") int id, Model model) {
        RgUser user = service.get(id);
        // Update fields
//      user.setFirstName(user.getFirstName());
        model.addAttribute("user", user);
        return "new";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        service.delete(id);
        return "redirect:/";
    }
      
}


