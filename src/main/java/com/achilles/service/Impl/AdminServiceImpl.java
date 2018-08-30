package com.achilles.service.Impl;

import com.achilles.admin.AdminDao;
import com.achilles.admin.Admin;
import com.achilles.admin.AdminDaoImpl;
import com.achilles.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author Achilles 2018-08-28
 */
@Service(value = "adminServiceImpl")
@Transactional
public class AdminServiceImpl implements AdminService {
    @Resource
    @Autowired
    private AdminDaoImpl adminDaoImpl;

    @Override
    public void saveAdminService(Admin admin) {
        adminDaoImpl.saveAdmin(admin);
    }

    public Admin login(Admin admin) {
        return adminDaoImpl.login(admin);
    }
}
