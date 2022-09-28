package com.zhijie.sm.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class StudentAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    protected Class<?>[] getServletConfigClasses() {
        Class[] configFiles = {StudentAppConfig.class};
        return configFiles;
    }

    protected String[] getServletMappings() {
        String[] mappings = {"/"};
        return mappings;
    }
}
