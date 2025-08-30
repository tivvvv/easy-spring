package com.tiv.easy.spring.beans.factory.support;

import com.tiv.easy.spring.beans.factory.BeanDefinitionStoreException;
import com.tiv.easy.spring.beans.factory.NoSuchBeanDefinitionException;
import com.tiv.easy.spring.beans.factory.config.BeanDefinition;

/**
 * Registry interface for bean definitions, providing methods for registering,
 * removing, and retrieving bean definitions.
 */
public interface BeanDefinitionRegistry {

    /**
     * Register a new bean definition with this registry.
     *
     * @param beanName       the name of the bean instance to register
     * @param beanDefinition definition of the bean instance to register
     * @throws BeanDefinitionStoreException if the BeanDefinition is invalid
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition)
            throws BeanDefinitionStoreException;

    /**
     * Remove the BeanDefinition for the given bean name.
     *
     * @param beanName the name of the bean instance to remove
     * @throws NoSuchBeanDefinitionException if there is no such bean definition
     */
    void removeBeanDefinition(String beanName) throws NoSuchBeanDefinitionException;

    /**
     * Return the BeanDefinition for the given bean name.
     *
     * @param beanName name of the bean to find a definition for
     * @return the BeanDefinition for the given bean name
     * @throws NoSuchBeanDefinitionException if there is no such bean definition
     */
    BeanDefinition getBeanDefinition(String beanName) throws NoSuchBeanDefinitionException;

    /**
     * Return the number of beans defined in the registry.
     *
     * @return the number of beans defined in the registry
     */
    int getBeanDefinitionCount();

}
