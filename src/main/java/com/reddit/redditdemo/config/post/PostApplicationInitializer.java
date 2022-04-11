package com.reddit.redditdemo.config.post;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class PostApplicationInitializer extends AbstractDispatcherServletInitializer {
    @Override
    protected WebApplicationContext createServletApplicationContext() {

        AnnotationConfigWebApplicationContext postWebAppContext = new AnnotationConfigWebApplicationContext();

        postWebAppContext.register(PostApplicationConfig.class);

        return postWebAppContext;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/post"};
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
