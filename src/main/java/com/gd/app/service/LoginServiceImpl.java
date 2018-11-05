package com.gd.app.service;

import com.gd.app.dao.CassandraDao;
import com.gd.app.model.LoginRequest;
import com.gd.app.model.User;
import com.google.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.gd.app.util.ResponseBuilder;

import javax.ws.rs.core.Response;

/**
 * @author Gaurang Deshpande
 */
public class LoginServiceImpl implements LoginService {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginServiceImpl.class);
    private final CassandraDao cassandraDao;

    @Inject
    public LoginServiceImpl(CassandraDao cassandraDao) {
        this.cassandraDao = cassandraDao;
    }

    public Response loginWithGoogleApi(final LoginRequest loginRequest) {
        LOGGER.info("Starting login call to Google API with request: [{}]", loginRequest);

        User user = new User(loginRequest.getId(), loginRequest.getEmail(), loginRequest.getName(), loginRequest.getImageUrl());

        LOGGER.info("Credentials obtained for user [{}] from Google ", user);
        cassandraDao.saveUserToCassandra(user);
        return Response.ok().entity(ResponseBuilder.buildLoginResponse(user)).build();
    }

    public Response loginWithFacebookApi(final LoginRequest loginRequest) {
        LOGGER.info("Starting login call to Facebook API with request: [{}]", loginRequest);

        User user = new User(loginRequest.getId(), loginRequest.getEmail(), loginRequest.getName(), loginRequest.getImageUrl());

        LOGGER.info("Creds obtained for user [{}] from Facebook ", user);
        cassandraDao.saveUserToCassandra(user);
        return Response.ok().entity(ResponseBuilder.buildLoginResponse(user)).build();
    }
}
