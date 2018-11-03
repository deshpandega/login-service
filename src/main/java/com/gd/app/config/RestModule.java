package com.gd.app.config;

import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.guice.JerseyServletModule;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;

import java.util.Map;
import java.util.HashMap;

/**
 * @author Gaurang Deshpande
 */
public class RestModule extends JerseyServletModule {

    @Override
    protected void configureServlets() {
        serve("/*").with(GuiceContainer.class, initParams());
    }

    private Map<String, String> initParams() {
        Map<String, String> initParams = new HashMap<String, String>();
        initParams.put(PackagesResourceConfig.PROPERTY_PACKAGES, "com.gd.app");
        return initParams;
    }
}
