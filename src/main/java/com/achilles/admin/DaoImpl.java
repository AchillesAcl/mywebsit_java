package com.achilles.admin;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author Achilles 2018-08-28
 */
@Repository("adminDao")
public class DaoImpl implements Dao {
    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * 使用getCurrentSession注意怎么避免没有session
     */
    @Override
    public void save(Admin admin) {
        sessionFactory.openSession().save(admin);
    }

    @Override
    public void load(String name,String password) {
        Session session = sessionFactory.getCurrentSession();
        Admin admin = (Admin) session.get("from Admin where name=? and password =?", Admin.class);
    }
}
