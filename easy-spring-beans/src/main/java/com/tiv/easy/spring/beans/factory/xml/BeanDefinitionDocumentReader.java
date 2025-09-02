package com.tiv.easy.spring.beans.factory.xml;

import com.tiv.easy.spring.beans.factory.BeanDefinitionStoreException;
import org.w3c.dom.Document;

/**
 * SPI interface for parsing XML bean definition documents.
 *
 * <p>This interface is implemented by classes that can read bean definitions
 * from a DOM document and register them with a bean definition registry.
 */
public interface BeanDefinitionDocumentReader {

    /**
     * Read bean definitions from the given DOM document and registers them with the registry.
     *
     * @param doc           the DOM document containing bean definitions
     * @param readerContext the current context for bean definition parsing
     * @throws BeanDefinitionStoreException in case of parsing errors
     */
    void registerBeanDefinitions(Document doc, XmlReaderContext readerContext) throws BeanDefinitionStoreException;

}
