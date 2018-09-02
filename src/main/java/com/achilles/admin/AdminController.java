package com.achilles.admin;

import com.achilles.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author Achilles 2018-09-01
 */
@Controller
@RequestMapping("test")
public class AdminController {
    @Resource()
    private AdminService adminService;
    @RequestMapping(value ="/save",method = RequestMethod.POST)
    @ResponseBody
    public Admin creatAdmin(){
        Admin admin = new Admin();
        admin.setId(1);
        admin.setName("achilles");
        admin.setPassword("123");
        adminService.save(admin);
        return admin;
    }
}
