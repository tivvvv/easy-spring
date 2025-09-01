package com.tiv.easy.spring.core.io.support;

import com.tiv.easy.spring.core.io.Resource;
import com.tiv.easy.spring.core.io.ResourceLoader;

import java.io.IOException;

/**
 * Strategy interface for resolving resources based on pattern matching.
 */
public interface ResourcePatternResolver extends ResourceLoader {

    /**
     * Pseudo URL prefix for matching all class path resources.
     * Unlike standard classpath:, this prefix searches in all JAR roots.
     */
    String CLASSPATH_ALL_URL_PREFIX = "classpath*:";

    /**
     * Return all resources matching the given pattern.
     * The returned array should have Set semantics - each resource should appear only once.
     *
     * @param locationPattern the resource location pattern
     * @return array of matching Resource objects
     * @throws IOException if an I/O error occurs
     */
    Resource[] getResources(String locationPattern) throws IOException;

}
