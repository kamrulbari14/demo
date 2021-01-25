package com.luv2code.demoadmin.rest;

import com.luv2code.demoadmin.entity.Admin;
import com.luv2code.demoadmin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminRestController {

    private AdminService adminService;

    @Autowired

    public AdminRestController(AdminService adminService) {
        this.adminService = adminService;
    }

    @CrossOrigin(origins = "https://demo-0523.herokuapp.com")
    @PostMapping("/addAdmin")
    public Admin addEmployee(@RequestBody Admin admin) {
        admin.setId(0);
        adminService.saveAdmin(admin);
        return admin;
    }
}
