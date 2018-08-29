package com.achilles.dao.Impl;

import com.achilles.dao.AdminDao;
import com.achilles.entity.Admin;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Achilles 2018-08-28
 */
//在Spring中为adminImpl命名
@Repository
public class AdminImpl implements AdminDao {
    private HibernateTemplate template;

    //注入adminImpl
    @Autowired
    public AdminImpl(SessionFactory sessionFactory) {
        this.template = new HibernateTemplate(sessionFactory);
    }

    @Override
    public void saveAdmin(Admin admin) {
        template.save(admin);
    }

    @Override
    public void loadAdmin(Admin admin) {
    template.find("from entity.Admin a where a.name=?","admin");
    }
}
