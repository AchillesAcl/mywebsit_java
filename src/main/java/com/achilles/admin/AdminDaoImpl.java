package com.achilles.admin;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Achilles 2018-08-28
 */
//在Spring中为adminImpl命名
@Component("adminDao")
@Repository
public class AdminDaoImpl implements AdminDao {
    @Resource
    private HibernateTemplate template;

    //注入adminImpl
    @Autowired
    public AdminDaoImpl(SessionFactory sessionFactory) {
        this.template = new HibernateTemplate(sessionFactory);
    }

    @Override
    public void saveAdmin(Admin admin) {
        template.save(admin);
    }


    @Override
    public Admin login(Admin admin) {
        List<Admin> list = (List<Admin>) template.find("from Admin where name=? and password =?", admin.getName(), admin.getPassword());
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }
}
