package com.achilles.admin;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author Achilles 2018-08-28
 */
@Repository("adminDao")
public class AdminDao {
    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * 使用getCurrentSession注意怎么避免没有session
     */
    public void save(Admin admin) {
        sessionFactory.openSession().save(admin);
    }


    void login(Admin admin) {
// sessionFactory.getCurrentSession().createQuery("from Admin where name=? and password =?", admin.getName(), admin.getPassword());
        Session session = sessionFactory.getCurrentSession();
        Admin admin1 = (Admin) session.get("from Admin where name=? and password =?", Admin.class);
    }


}
