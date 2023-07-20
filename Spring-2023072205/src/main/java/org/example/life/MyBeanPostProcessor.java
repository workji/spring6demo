package org.example.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * all ioc bean will be effect
 *
 * need to include at config.xml
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("3 call bean postprocessor before init method");
        System.out.println(beanName + "::" + bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("5 call bean postprocessor after init method");
        System.out.println(beanName + "::" + bean);
        return bean;
    }
}
