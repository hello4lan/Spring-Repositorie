package com.mx.app.client.main.client;

import javax.xml.bind.JAXBElement;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.mx.app.client.main.stub.ObtenerResultado;
import com.mx.app.client.main.stub.ObtenerResultadoResponse;

public class ClienteSoap extends WebServiceGatewaySupport{

	
	public ObtenerResultadoResponse getResponseService(String url , JAXBElement<ObtenerResultado> jaxbElement) {
		
		JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url , jaxbElement);
		return (ObtenerResultadoResponse) res.getValue();
	}
}
