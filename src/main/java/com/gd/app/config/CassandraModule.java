package com.gd.app.config;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import com.datastax.driver.mapping.MappingManager;
import com.google.inject.*;
import com.google.inject.name.Named;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Gaurang Deshpande
 */
public class CassandraModule extends AbstractModule{

    private static final Logger LOGGER = LoggerFactory.getLogger(CassandraModule.class);
    private static final String CASSANDRA_HOSTS = "127.0.0.1";
    private static final Integer CASSANDRA_PORT = 9042;

    private Cluster cluster;

    private Session session;

    @Override
    protected void configure() {
        this.connect(CASSANDRA_HOSTS, CASSANDRA_PORT);
        this.session = this.getSession();
    }

    public void connect(String node, Integer port) {
        Cluster.Builder b = Cluster.builder().addContactPoint(node);
        if (port != null) {
            b.withPort(port);
        }
        cluster = b.build();

        session = cluster.connect();
    }

    @Provides
    @Named("CassandraSession")
    public Session getSession() {
        return this.session;
    }

    public void close() {
        session.close();
        cluster.close();
    }

    @Provides
    @Named("CassandraMappingManager")
    @Inject
    public MappingManager getMappingManager(@Named("CassandraSession") final Session cassandraSession) {
        return new MappingManager(cassandraSession);
    }
}
