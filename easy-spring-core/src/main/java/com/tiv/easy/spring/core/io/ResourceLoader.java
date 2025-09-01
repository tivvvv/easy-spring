package com.tiv.easy.spring.core.io;

/**
 * Strategy interface for loading resources from various locations.
 */
public interface ResourceLoader {

    /**
     * Return a Resource handle for the specified location.
     * Support fully qualified URLs, e.g. "file:C:/test.dat".
     * Support classpath pseudo-URLs, e.g. "classpath:test.dat".
     * Support relative file paths, e.g. "WEB-INF/test.dat".
     * Note: Call {@link Resource#exists()} to check for existence.
     *
     * @param location the resource location
     * @return Resource handle
     */
    Resource getResource(String location);

    /**
     * Return the ClassLoader used by this ResourceLoader.
     *
     * @return the ClassLoader
     */
    ClassLoader getClassLoader();

}
