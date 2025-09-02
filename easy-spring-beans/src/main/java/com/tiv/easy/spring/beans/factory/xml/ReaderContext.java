package com.tiv.easy.spring.beans.factory.xml;

import com.tiv.easy.spring.core.io.Resource;

/**
 * Context holder for bean definition parsing process.
 *
 * <p>Provides access to the source {@link Resource} being parsed.
 */
public class ReaderContext {

    private final Resource resource;

    /**
     * Create a new ReaderContext.
     *
     * @param resource the resource being parsed
     */
    public ReaderContext(Resource resource) {
        this.resource = resource;
    }

    /**
     * Return the resource being parsed.
     *
     * @return the resource
     */
    public final Resource getResource() {
        return this.resource;
    }

}
