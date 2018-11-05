package com.gd.app.dao;

import com.datastax.driver.core.ConsistencyLevel;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.Statement;
import com.datastax.driver.mapping.MappingManager;
import com.gd.app.dao.accessor.LoginAccessor;
import com.gd.app.model.User;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Gaurang Deshpande
 */
public class CassandraDaoImpl implements CassandraDao {

    private static final Logger LOGGER = LoggerFactory.getLogger(CassandraDaoImpl.class);

    private final Session cassandraSession;
    private final LoginAccessor loginAccessor;

    @Inject
    public CassandraDaoImpl(@Named("CassandraSession") final Session cassandraSession,
        @Named("CassandraMappingManager") final MappingManager mappingManager) {
        this.cassandraSession = cassandraSession;
        this.loginAccessor = mappingManager.createAccessor(LoginAccessor.class);
    }

    public void saveUserToCassandra(User user){
        LOGGER.info("Insert data to cassandra with user [{}], [{}], [{}] and [{}]",
                user.getId(), user.getEmail(), user.getName(), user.getImageUrl());
        final Statement insertStatement =
                loginAccessor.insertCredentials(user.getId(), user.getEmail(), user.getName(), user.getImageUrl());

        insertStatement.setConsistencyLevel(ConsistencyLevel.QUORUM);
        cassandraSession.execute(insertStatement);
    }
}
