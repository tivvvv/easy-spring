package com.tiv.easy.spring.core.io;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/**
 * Interface for a resource descriptor that abstracts from the actual
 * type of underlying resource, such as a file or class path resource.
 */
public interface Resource extends InputStreamSource {

    /**
     * Return whether this resource actually exists in physical form.
     *
     * @return whether this resource actually exists
     */
    boolean exists();

    /**
     * Return whether this resource is readable.
     *
     * @return whether this resource is readable
     */
    default boolean isReadable() {
        return exists();
    }

    /**
     * Return whether this resource represents a handle with an open stream.
     * If true, the InputStream cannot be read multiple times, and must be read
     * once only and then closed to avoid resource leaks.
     *
     * @return whether this resource represents a handle with an open stream
     */
    default boolean isOpen() {
        return false;
    }

    /**
     * Return whether this resource represents a file in a file system.
     *
     * @return whether this resource represents a file
     */
    default boolean isFile() {
        return false;
    }

    /**
     * Return a URL handle for this resource.
     *
     * @return the URL handle for this resource
     * @throws IOException if the resource cannot be resolved as URL
     */
    URL getURL() throws IOException;

    /**
     * Return a URI handle for this resource.
     *
     * @return the URI handle for this resource
     * @throws IOException if the resource cannot be resolved as URI
     */
    URI getURI() throws IOException;

    /**
     * Return a File handle for this resource.
     *
     * @return the File handle for this resource
     * @throws IOException if the resource cannot be resolved as File
     */
    File getFile() throws IOException;

    /**
     * Return a ReadableByteChannel for this resource.
     * <p>Each call should return a fresh channel.
     *
     * @return the byte channel for this resource
     * @throws IOException if the channel cannot be opened
     */
    default ReadableByteChannel readableChannel() throws IOException {
        return Channels.newChannel(getInputStream());
    }

    /**
     * Determine the content length for this resource.
     *
     * @return the content length for this resource
     * @throws IOException if the resource cannot be resolved
     */
    long contentLength() throws IOException;

    /**
     * Determine the last-modified timestamp for this resource.
     *
     * @return the last-modified timestamp for this resource
     * @throws IOException if the resource cannot be resolved
     */
    long lastModified() throws IOException;

    /**
     * Create a resource relative to this resource.
     *
     * @param relativePath the relative path (relative to this resource)
     * @return the resource handle for the relative resource
     * @throws IOException if the relative resource cannot be determined
     */
    Resource createRelative(String relativePath) throws IOException;

    /**
     * Determine a filename for this resource.
     *
     * @return the filename for this resource
     */
    String getFilename();

    /**
     * Return a description for this resource,
     * to be used for error output when working with the resource.
     *
     * @return a description for this resource
     */
    String getDescription();

}
