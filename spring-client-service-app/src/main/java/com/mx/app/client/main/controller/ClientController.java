package com.mx.app.client.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mx.app.client.main.client.SOAPclient;
import com.mx.app.client.main.stub.ObtenerResultado;
import com.mx.app.client.main.stub.ObtenerResultadoResponse;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api
@RestController
public class ClientController {

	@Autowired
	private SOAPclient client;
	@ApiOperation(value="Respond hello <Name>!!" , notes="Return a Json Response with string followed", response = ObtenerResultadoResponse.class)
	@RequestMapping(value = "/getOperacion/{numeroUno}/{numeroDos}" , method = RequestMethod.GET)
	@ApiResponses(value = {
		@ApiResponse(code=200 , message ="operacion exitosa exitoso"),
		@ApiResponse(code=404 , message ="operacion fallida"),
		@ApiResponse(code=500 , message ="error en el servidor")
	})		
	
	public ObtenerResultadoResponse getOperacion(@PathVariable(value = "numeroUno")  String numero1,  @PathVariable(value = "numeroDos") String numero2 ) {
		
		return client.getResponse(Integer.parseInt(numero1), Integer.parseInt(numero2)); 
		 
	}
}
