package com.tiv.easy.spring.beans.factory.xml;

import org.w3c.dom.Document;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;

/**
 * Strategy interface for loading an XML {@link Document}.
 */
public interface DocumentLoader {

    /**
     * Load a {@link Document document} from the supplied {@link InputSource source}.
     *
     * @param inputSource    the source of the document that is to be loaded
     * @param entityResolver the resolver that is to be used to resolve any entities
     * @param errorHandler   used to report any errors during document loading
     * @param validationMode the type of validation
     * @param namespaceAware {@code true} if support for XML namespaces is to be provided
     * @return the loaded {@link Document document}
     * @throws Exception if an error occurs
     */
    Document loadDocument(InputSource inputSource, EntityResolver entityResolver, ErrorHandler errorHandler, int validationMode, boolean namespaceAware) throws Exception;

}