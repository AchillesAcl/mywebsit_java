package com.achilles.admin;

/**
 * @author Achilles 2018-08-28
 */
public interface AdminDao {
    void saveAdmin(Admin admin);
    Admin login(Admin admin);
}
