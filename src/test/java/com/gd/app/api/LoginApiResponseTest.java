package com.gd.app.api;

import com.gd.app.dao.CassandraDao;
import com.gd.app.service.LoginServiceImpl;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * @author Gaurang Deshpande
 */
@RunWith(MockitoJUnitRunner.class)
public abstract class LoginApiResponseTest {

    @Mock
    public CassandraDao cassandraDao;

    @InjectMocks
    public LoginServiceImpl loginServiceImpl;

    protected LoginApiResponse apiResponse;

    @Before
    public void setUp() {
        apiResponse = new LoginApiResponse(loginServiceImpl);
    }
}
