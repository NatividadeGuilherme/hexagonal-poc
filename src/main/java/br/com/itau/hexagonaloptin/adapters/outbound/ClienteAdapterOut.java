package br.com.itau.hexagonaloptin.adapters.outbound;

import br.com.itau.hexagonaloptin.application.domain.ClienteDomain;
import br.com.itau.hexagonaloptin.application.ports.out.ClientePortOut;

public class ClienteAdapterOut implements ClientePortOut {

	private final ClienteRepository clienteRepository;

	public ClienteAdapterOut(ClienteRepository clienteRepository) {
		super();
		this.clienteRepository = clienteRepository;
	}

	@Override
	public ClienteDomain adicionar(ClienteDomain cliente) {
		clienteRepository.save(null)
		return null;;
	}

	@Override
	public ClienteDomain obterClientePorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
