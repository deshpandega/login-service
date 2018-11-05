package com.gd.app.service;

import com.gd.app.dao.CassandraDao;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * @author Gaurang Deshpande
 */
@RunWith(MockitoJUnitRunner.class)
public abstract class LoginServiceImplTest {

    @Mock
    public CassandraDao cassandraDao;

    @InjectMocks
    public LoginServiceImpl loginServiceImpl;

    @Before
    public void setUp() {
    }
}
