package com.achilles.service;

import com.achilles.admin.Admin;
import com.achilles.admin.AdminDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author Achilles 2018-09-01
 */
@Service("adminService")
public class AdminService {
    @Resource(name = "adminDao")
    private AdminDao adminDao;
    @Transactional
    public void save(Admin admin){
        adminDao.save(admin);
    }
    public Admin creatAdmin(){
        Admin admin =new Admin();
        admin.setPassword("123");
        admin.setName("achilles");
        return admin;
    }

}
