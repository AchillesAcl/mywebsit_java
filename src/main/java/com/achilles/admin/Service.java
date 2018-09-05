package com.achilles.admin;

/**
 * @author Achilles
 */
public interface Service {
    /**
     * 保存用户
     *
     * @param admin 保存的对象
     */
    void save(Admin admin);

    /**
     * 获取用户信息
     *
     * @param password 获取的对象
     * @param name  通过用户名获取用户信息
     */
    void load(String name, String password);
}
