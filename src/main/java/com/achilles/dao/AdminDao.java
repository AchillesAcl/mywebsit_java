package com.achilles.dao;

import com.achilles.entity.Admin;

/**
 * @author Achilles 2018-08-28
 */
public interface AdminDao {
    void saveAdmin(Admin admin);
    void loadAdmin(Admin admin);
}
