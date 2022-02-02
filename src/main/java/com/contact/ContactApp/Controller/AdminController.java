package com.contact.ContactApp.Controller;

import com.contact.ContactApp.Model.Admin;
import com.contact.ContactApp.Service.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {
    
    @Autowired
    private AdminService adminService;


    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }


    @GetMapping("/register")
    public String register(){
        return "registerAdmin";
    }

    @PostMapping("/saveOrUpdate")
    public String saveOrUpdate(ModelMap model, @ModelAttribute("ADMIN") Admin admin){
        adminService.saveAdmin(admin);
        System.out.println("Size: " +  adminService.getAllAdmin().size());
        return "registerAdmin";
    }

}   
