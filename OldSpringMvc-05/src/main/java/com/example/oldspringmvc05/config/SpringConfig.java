package com.example.oldspringmvc05.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@ComponentScan(
        basePackages = "com.example.oldspringmvc05",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Controller.class)
)
public class SpringConfig {
}
