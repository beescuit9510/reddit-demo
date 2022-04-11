package com.reddit.redditdemo.config.user;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

@Configuration
public class UserWebApplicationInitializer extends AbstractDispatcherServletInitializer {

    @Override
    protected WebApplicationContext createServletApplicationContext() {

        AnnotationConfigWebApplicationContext userWebAppContext = new AnnotationConfigWebApplicationContext();

        userWebAppContext.register(UserApplicationConfig.class);

        return userWebAppContext;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/user"};
    }

    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }

    @Override
    protected String getServletName() {
        return this.getClass().getName() + "Dispatcher";
    }
}
