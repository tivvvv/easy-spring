package com.tiv.easy.spring.factory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Bean factory class for managing singleton beans in Spring
 * Provides bean registration and retrieval functionality
 */
public class BeanFactory {

    /**
     * Container for storing singleton beans
     * Using ConcurrentHashMap to ensure thread safety
     */
    private final static Map<String, Object> singletonObjects = new ConcurrentHashMap<>();

    /**
     * Get singleton bean instance by bean name
     *
     * @param beanName the name of the bean
     * @return bean instance, or null if not exists
     */
    public static Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    /**
     * Register a singleton bean
     *
     * @param beanName        the name of the bean
     * @param singletonObject the bean instance
     * @throws IllegalArgumentException if beanName or singletonObject is null
     * @throws IllegalStateException    if a bean with the same name already exists
     */
    public static void registerBean(String beanName, Object singletonObject) {
        if (beanName == null) {
            throw new IllegalArgumentException("beanName must not be null");
        }

        if (singletonObject == null) {
            throw new IllegalArgumentException("singletonObject must not be null");
        }

        // Use synchronized to ensure atomicity of check and insert operations
        synchronized (singletonObjects) {
            Object oldObject = singletonObjects.get(beanName);
            if (oldObject != null) {
                throw new IllegalStateException(String.format("Bean %s already exists", beanName));
            }
            singletonObjects.put(beanName, singletonObject);
        }
    }

}
