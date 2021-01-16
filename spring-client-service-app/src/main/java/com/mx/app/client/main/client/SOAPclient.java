package com.mx.app.client.main.client;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.mx.app.client.main.stub.ObjectFactory;
import com.mx.app.client.main.stub.ObtenerResultado;
import com.mx.app.client.main.stub.ObtenerResultadoResponse;

@Service
public class SOAPclient {

	@Autowired
	private ClienteSoap cliente;


	public ObtenerResultadoResponse getResponse(int request1, int request2) {
		ObjectFactory objectFactory = new ObjectFactory();
		ObtenerResultado req = new ObtenerResultado();
		req.setArg0(request1);
		req.setArg1(request2);


		ObtenerResultadoResponse response = cliente.getResponseService("http://localhost:2100/WS/Calculadora",
				objectFactory.createObtenerResultado(req));

		return response;
	}

}
