package com.gd.app.config;

import com.gd.app.api.ApiResponse;
import com.gd.app.api.LoginApiResponse;
import com.gd.app.dao.CassandraDao;
import com.gd.app.dao.CassandraDaoImpl;
import com.gd.app.service.LoginService;
import com.gd.app.service.LoginServiceImpl;
import com.google.inject.AbstractModule;
import com.google.inject.Scopes;

/**
 * @author Gaurang Deshpande
 */
public class LoginModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(ApiResponse.class).to(LoginApiResponse.class).in(Scopes.SINGLETON);
        bind(LoginService.class).to(LoginServiceImpl.class).in(Scopes.SINGLETON);
        bind(CassandraDao.class).to(CassandraDaoImpl.class).in(Scopes.SINGLETON);
    }
}
