package com.gd.app.dao;

import com.gd.app.model.User;

/**
 * @author Gaurang Deshpande
 */
public interface CassandraDao {
    void saveUserToCassandra(User user);
}
