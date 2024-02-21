package br.com.itau.hexagonaloptin.adapters.inbound.mappers;

import org.springframework.beans.BeanUtils;

import br.com.itau.hexagonaloptin.adapters.inbound.request.ClienteRequest;
import br.com.itau.hexagonaloptin.application.domain.ClienteDomain;


public class ClienteMapperIn {

	public static ClienteDomain toDomain(ClienteRequest clienteRequest) {
		ClienteDomain clienteDomain = new ClienteDomain();
		
		BeanUtils.copyProperties(clienteDomain , clienteRequest);
		
		return clienteDomain;
	}
}
