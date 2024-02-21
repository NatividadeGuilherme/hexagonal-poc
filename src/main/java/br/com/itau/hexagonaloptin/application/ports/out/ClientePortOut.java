package br.com.itau.hexagonaloptin.application.ports.out;

import br.com.itau.hexagonaloptin.application.domain.ClienteDomain;

public interface ClientePortOut {
	ClienteDomain adicionar(ClienteDomain cliente);

	ClienteDomain obterClientePorId(int id);
}
