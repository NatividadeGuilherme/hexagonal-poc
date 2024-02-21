package br.com.itau.hexagonaloptin.application.ports.in;

import br.com.itau.hexagonaloptin.application.domain.ClienteDomain;

public interface ClientePortIn {
     ClienteDomain adicionar(ClienteDomain cliente);
     
     ClienteDomain obterClientePorId(int id);
     
}
