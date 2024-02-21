package br.com.itau.hexagonaloptin.adapters.inbound.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.hexagonaloptin.adapters.inbound.mappers.ClienteMapperIn;
import br.com.itau.hexagonaloptin.adapters.inbound.request.ClienteRequest;
import br.com.itau.hexagonaloptin.application.domain.ClienteDomain;
import br.com.itau.hexagonaloptin.application.ports.in.ClientePortIn;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	private ClientePortIn clientePortIn;

	@PostMapping
	public ResponseEntity<ClienteRequest> adicionar(@RequestBody ClienteRequest clienteRequest) {

		ClienteDomain domain = ClienteMapperIn.toDomain(clienteRequest);

		clientePortIn.adicionar(domain);
		return null;
	}
}
