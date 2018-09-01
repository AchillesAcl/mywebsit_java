package com.achilles.admin;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author Achilles 2018-08-28
 */
@Repository
public class AdminDao {
    @Resource
    private SessionFactory sessionFactory;

    public void save(Admin admin) {
        sessionFactory.getCurrentSession().save(admin);
    }


    void login(Admin admin) {
//        sessionFactory.getCurrentSession().createQuery("from Admin where name=? and password =?", admin.getName(), admin.getPassword());
        Session session = sessionFactory.getCurrentSession();
        Admin admin1 = (Admin) session.get("from Admin where name=? and password =?", Admin.class);
    }



}
