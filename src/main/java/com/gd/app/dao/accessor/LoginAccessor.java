package com.gd.app.dao.accessor;

import com.datastax.driver.core.Statement;
import com.datastax.driver.mapping.annotations.Accessor;
import com.datastax.driver.mapping.annotations.Param;
import com.datastax.driver.mapping.annotations.Query;

/**
 * @author Gaurang Deshpande
 */
@Accessor
public interface LoginAccessor {

    @Query("INSERT INTO app.login (id, email, name, imageUrl) VALUES (:id, :email, :name, :imageUrl)")
    Statement insertCredentials(@Param("id") String id, @Param("email") String email,
                                @Param("name") String name, @Param("imageUrl") String imageUrl);
}
