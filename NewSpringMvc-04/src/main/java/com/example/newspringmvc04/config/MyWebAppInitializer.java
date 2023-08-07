package com.example.newspringmvc04.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    /* spring.xml */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{ SpringConfig.class };
    }

    /* spring-mvc.xml */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{ SpringMvcConfig.class };
    }

    /* spring-mvc url handler */
    @Override
    protected String[] getServletMappings() {
        return new String[]{ "/" };
    }
}
