//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.01.11 a las 06:11:17 PM CST 
//


package com.mx.app.client.main.stub;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mx.app.client.main.stub package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ObtenerResultado_QNAME = new QName("http://endpoint.service.app.mx.com/", "obtenerResultado");
    private final static QName _ObtenerResultadoResponse_QNAME = new QName("http://endpoint.service.app.mx.com/", "obtenerResultadoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mx.app.client.main.stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenerResultado }
     * 
     */
    public ObtenerResultado createObtenerResultado() {
        return new ObtenerResultado();
    }

    /**
     * Create an instance of {@link ObtenerResultadoResponse }
     * 
     */
    public ObtenerResultadoResponse createObtenerResultadoResponse() {
        return new ObtenerResultadoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerResultado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerResultado }{@code >}
     */
    @XmlElementDecl(namespace = "http://endpoint.service.app.mx.com/", name = "obtenerResultado")
    public JAXBElement<ObtenerResultado> createObtenerResultado(ObtenerResultado value) {
        return new JAXBElement<ObtenerResultado>(_ObtenerResultado_QNAME, ObtenerResultado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerResultadoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerResultadoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://endpoint.service.app.mx.com/", name = "obtenerResultadoResponse")
    public JAXBElement<ObtenerResultadoResponse> createObtenerResultadoResponse(ObtenerResultadoResponse value) {
        return new JAXBElement<ObtenerResultadoResponse>(_ObtenerResultadoResponse_QNAME, ObtenerResultadoResponse.class, null, value);
    }

}
