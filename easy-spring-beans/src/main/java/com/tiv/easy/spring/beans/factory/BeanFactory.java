package com.tiv.easy.spring.beans.factory;

import com.tiv.easy.spring.beans.BeansException;

/**
 * Central interface to provide configuration for beans
 * Defines methods to retrieve and inspect beans
 */
public interface BeanFactory {

    /**
     * Return an instance of the bean with the given name
     *
     * @param beanName the name of the bean to retrieve
     * @return an instance of the bean
     * @throws BeansException if the bean could not be retrieved
     */
    Object getBean(String beanName) throws BeansException;

    /**
     * Check whether the bean with the given name is a singleton
     *
     * @param beanName the name of the bean to check
     * @return true if the bean is a singleton, false otherwise
     * @throws NoSuchBeanDefinitionException if no bean with the given name is defined
     */
    boolean isSingleton(String beanName) throws NoSuchBeanDefinitionException;

    /**
     * Check whether the bean with the given name is a prototype
     *
     * @param beanName the name of the bean to check
     * @return true if the bean is a prototype, false otherwise
     * @throws NoSuchBeanDefinitionException if no bean with the given name is defined
     */
    boolean isPrototype(String beanName) throws NoSuchBeanDefinitionException;

}
