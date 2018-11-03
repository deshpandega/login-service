package com.gd.app.config;

import com.google.inject.*;
import com.google.inject.servlet.GuiceServletContextListener;


/**
 * @author Gaurang Deshpande
 */
public class Bootstrap extends GuiceServletContextListener {

    void configureBinder(Binder binder) {
        binder.install(new RestModule());
        binder.install(new LoginModule());
    }

    protected Injector getInjector() {
        return Guice.createInjector(new Module[]{new GuiceBootstrapModule()});
    }

    class GuiceBootstrapModule extends AbstractModule {
        protected GuiceBootstrapModule() {
        }

        protected void configure() {
            Bootstrap.this.configureBinder(this.binder());
        }
    }
}
