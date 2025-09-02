package com.tiv.easy.spring.beans.factory.xml;

import com.tiv.easy.spring.beans.factory.support.BeanDefinitionRegistry;
import com.tiv.easy.spring.core.io.Resource;
import com.tiv.easy.spring.core.io.ResourceLoader;

/**
 * Extension of {@link ReaderContext} for XML bean definition parsing.
 *
 * <p>Provides access to the {@link XmlBeanDefinitionReader} and its associated
 * configuration like {@link BeanDefinitionRegistry} and {@link ResourceLoader}.
 */
public class XmlReaderContext extends ReaderContext {

    private final XmlBeanDefinitionReader reader;

    /**
     * Create a new XmlReaderContext.
     *
     * @param resource the resource being parsed
     * @param reader   the XML bean definition reader in use
     */
    public XmlReaderContext(Resource resource, XmlBeanDefinitionReader reader) {
        super(resource);
        this.reader = reader;
    }

    /**
     * Return the XML bean definition reader in use.
     *
     * @return the XML bean definition reader
     */
    public final XmlBeanDefinitionReader getReader() {
        return this.reader;
    }

    /**
     * Return the bean definition registry that should be used for registering beans.
     *
     * @return the bean definition registry
     */
    public final BeanDefinitionRegistry getRegistry() {
        return this.reader.getRegistry();
    }

    /**
     * Return the resource loader to use for resource locations.
     *
     * @return the resource loader
     */
    public final ResourceLoader getResourceLoader() {
        return this.reader.getResourceLoader();
    }

    /**
     * Return the class loader to use for bean class loading.
     *
     * @return the bean class loader
     */
    public final ClassLoader getBeanClassLoader() {
        return this.reader.getBeanClassLoader();
    }

}
