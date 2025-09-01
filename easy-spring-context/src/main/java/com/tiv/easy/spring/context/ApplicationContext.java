package com.tiv.easy.spring.context;

import com.tiv.easy.spring.beans.factory.BeanFactory;
import com.tiv.easy.spring.core.io.support.ResourcePatternResolver;

/**
 * Central interface to provide configuration for an application.
 * <p>Provides:
 * <ul>
 * <li>Bean factory methods</li>
 * <li>Resource loading capabilities</li>
 * <li>Application lifecycle management</li>
 * </ul>
 */
public interface ApplicationContext extends BeanFactory, ResourcePatternResolver {

    /**
     * Return the unique id of this application context.
     *
     * @return the unique id of the context, or {@code null} if none
     */
    String getId();

    /**
     * Return a name for the deployed application that this context belongs to.
     *
     * @return a name for the deployed application, or the empty String by default
     */
    String getApplicationName();

    /**
     * Return a friendly name for this context.
     *
     * @return a display name for this context (never {@code null})
     */
    String getDisplayName();

}
