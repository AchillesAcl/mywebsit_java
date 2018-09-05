package com.achilles.admin;

/**
 * @author Achilles
 */
public interface Dao {
    /**
     * 保存用户到数据库
     * @param admin 用户对象
     */
    void save(Admin admin);
    /**
     * 从数据库加载用户
     * @param name 用户名
     * @param password 密码
     */
    void load(String name,String password);
}
