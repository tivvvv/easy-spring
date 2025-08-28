package com.tiv.easy.spring.beans.factory;

import com.tiv.easy.spring.beans.BeansException;

/**
 * Exception thrown when a bean definition is not found in the bean factory
 */
public class NoSuchBeanDefinitionException extends BeansException {

    private final String beanName;

    /**
     * Construct a new NoSuchBeanDefinitionException for the specified bean name
     *
     * @param beanName the name of the missing bean
     */
    public NoSuchBeanDefinitionException(String beanName) {
        super(String.format("No bean named '%s' is defined", beanName));
        this.beanName = beanName;
    }

    /**
     * Construct a new NoSuchBeanDefinitionException for the specified bean name with additional message
     *
     * @param beanName the name of the missing bean
     * @param message  additional detail message
     */
    public NoSuchBeanDefinitionException(String beanName, String message) {
        super(String.format("No bean named '%s' is defined: %s", beanName, message));
        this.beanName = beanName;
    }

}
