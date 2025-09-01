package com.tiv.easy.spring.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * Simple interface for objects that are sources for an {@link InputStream}.
 */
public interface InputStreamSource {

    /**
     * Return an {@link InputStream} for the content of an underlying resource.
     * <p>It is expected that each call creates a <i>fresh</i> stream.
     *
     * @return the input stream for the underlying resource
     * @throws IOException if the stream could not be opened
     */
    InputStream getInputStream() throws IOException;

}
