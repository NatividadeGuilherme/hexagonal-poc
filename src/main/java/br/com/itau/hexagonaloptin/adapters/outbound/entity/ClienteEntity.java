package br.com.itau.hexagonaloptin.adapters.outbound.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ClienteEntity {

	public ClienteEntity(LocalDateTime dataInclusao) {
		super();
		this.dataInclusao = LocalDateTime.now();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Nonnull
	private String nome;

	@Nonnull
	private LocalDate dataNascimento;

	private LocalDateTime dataInclusao;

	@Nonnull
	private String rg;

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public LocalDateTime getDataInclusao() {
		return dataInclusao;
	}

	public String getRg() {
		return rg;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

}
