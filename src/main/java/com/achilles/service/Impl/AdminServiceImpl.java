package com.achilles.service.Impl;

import com.achilles.dao.AdminDao;
import com.achilles.entity.Admin;
import com.achilles.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Achilles 2018-08-28
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;

    @Override
    public void saveAdminService(Admin admin) {
        adminDao.saveAdmin(admin);
    }
}
