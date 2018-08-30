package com.achilles.admin;

import com.achilles.service.Impl.AdminServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author Achilles 2018-08-28
 */
@Controller("adminAction")
@Scope("prototype")
public class AdminAction extends ActionSupport {


    @Resource
    private AdminServiceImpl adminServiceImpl;
    private String name;
    private String password;

    public AdminServiceImpl getAdminServiceImpl() {
        return adminServiceImpl;
    }

    public void setAdminServiceImpl(AdminServiceImpl adminServiceImpl) {
        this.adminServiceImpl = adminServiceImpl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String login() {
        Admin admin = new Admin();
        admin.setName(name);
        admin.setPassword(password);
        Admin adminQuit = adminServiceImpl.login(admin);
        if (adminQuit != null) {
            HttpServletRequest request = ServletActionContext.getRequest();
            request.getSession().setAttribute("admin", adminQuit);
            return "loginSuccess";
        } else {
            return "login";
        }
    }
}
