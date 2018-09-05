package com.achilles.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author Achilles 2018-09-01
 */
@Controller
@RequestMapping("/test")
public class AdminController {
    @Resource
    private ServiceImpl serviceImpl;
    @ResponseBody
    @RequestMapping(value ="/save")
    public Admin creatAdmin( ){
        Admin admin = new Admin("/save");
        admin.setId(1);
        admin.setName("achilles");
        admin.setPassword("123");
        serviceImpl.save(admin);
        return admin;
    }
    @RequestMapping(value = "/login")
    @ResponseBody
    public Admin loginAdmin(String name,String password){

        Admin admin = new Admin("/login");
        serviceImpl.load(name,password);
        return admin;
    }
}
