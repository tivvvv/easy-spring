package com.tiv.easy.spring.beans.factory.config;

/**
 * Interface that defines a registry for singleton beans
 * Provides methods for registering, retrieving and checking singleton bean instances
 */
public interface SingletonBeanRegistry {

    /**
     * Register the given existing object as singleton in the bean registry
     *
     * @param beanName        the name of the bean
     * @param singletonObject the existing object to be registered
     */
    void registerSingleton(String beanName, Object singletonObject);

    /**
     * Return the singleton object registered under the given name
     *
     * @param beanName the name of the bean to retrieve
     * @return the singleton object, or null if no bean with the given name exists
     */
    Object getSingleton(String beanName);

    /**
     * Check if this registry contains a singleton instance with the given name
     *
     * @param beanName the name of the bean to check
     * @return true if a singleton instance with the given name exists, false otherwise
     */
    boolean containsSingleton(String beanName);

}
