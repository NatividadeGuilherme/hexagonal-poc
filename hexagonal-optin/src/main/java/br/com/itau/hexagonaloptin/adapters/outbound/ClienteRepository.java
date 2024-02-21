package br.com.itau.hexagonaloptin.adapters.outbound;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.itau.hexagonaloptin.adapters.outbound.entity.ClienteEntity;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Integer> {

}
