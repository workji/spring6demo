package com.example.oldspringmvc04.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@ComponentScan(
        basePackages = "com.example.oldspringmvc04.controller",
        includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Controller.class)
)
public class SpringMvcConfig {
}
