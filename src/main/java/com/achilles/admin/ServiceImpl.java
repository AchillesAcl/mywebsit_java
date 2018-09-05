package com.achilles.admin;

import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author Achilles 2018-09-01
 */
@org.springframework.stereotype.Service("adminService")
public class ServiceImpl implements Service {
    @Resource(name = "adminDao")
    private DaoImpl daoImpl;
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void save(Admin admin) {
        daoImpl.save(admin);
    }

    @Override
    public void load(String name,String password) {
        daoImpl.load(name,password);
    }
}
