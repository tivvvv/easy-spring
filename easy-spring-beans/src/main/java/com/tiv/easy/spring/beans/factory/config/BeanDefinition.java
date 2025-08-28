package com.tiv.easy.spring.beans.factory.config;

/**
 * Interface for bean definition, describing a bean instance with its properties,
 * constructor arguments, and other configuration metadata.
 */
public interface BeanDefinition {

    /**
     * Set the name of the bean class
     *
     * @param beanClassName the fully qualified class name of the bean
     */
    void setBeanClassName(String beanClassName);

    /**
     * Set the scope of the bean
     *
     * @param scope the scope of the bean (e.g., singleton, prototype)
     */
    void setScope(String scope);

    /**
     * Set the names of the beans that this bean depends on
     *
     * @param dependsOn array of bean names this bean depends on
     */
    void setDependsOn(String... dependsOn);

    /**
     * Check if the bean is a singleton
     *
     * @return true if the bean is a singleton, false otherwise
     */
    boolean isSingleton();

    /**
     * Check if the bean is a prototype
     *
     * @return true if the bean is a prototype, false otherwise
     */
    boolean isPrototype();

    /**
     * Specify the factory bean to use, if any
     *
     * @param factoryBeanName the name of the factory bean
     */
    void setFactoryBeanName(String factoryBeanName);

}
