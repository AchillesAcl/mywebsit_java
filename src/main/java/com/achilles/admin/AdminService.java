package com.achilles.admin;

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
}
