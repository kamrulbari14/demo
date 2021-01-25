package com.luv2code.demoadmin.rest;

import com.luv2code.demoadmin.entity.Admin;
import com.luv2code.demoadmin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminRestController {

    private AdminService adminService;

    @Autowired

    public AdminRestController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping("/addAdmin")
    public Admin addEmployee(@RequestBody Admin admin) {
        admin.setId(0);
        adminService.saveAdmin(admin);
        return admin;
    }
}
