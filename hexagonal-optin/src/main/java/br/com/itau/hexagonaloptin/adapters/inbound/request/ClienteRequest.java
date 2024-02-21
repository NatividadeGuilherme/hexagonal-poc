package br.com.itau.hexagonaloptin.adapters.inbound.request;

import java.time.LocalDate;

public class ClienteRequest {
	
	
	private String nome;
	private LocalDate dataNascimento;
	private String rg;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
}
