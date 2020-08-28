package br.com.mgoficina.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import br.com.mgoficina.Enumerators.TipoPagamento;

public class Servico {

	private long id;
	private String nome;
	private LocalDate dataInicial;
	private LocalDateTime dataFinal = null;
	private double valor;
	private TipoPagamento tipoPagamento;
	
	public Servico(long id, String nome, LocalDate dataInicial, LocalDateTime dataFinal, double valor, TipoPagamento tipoPagamento) {
		this.id = id;
		this.nome = nome;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.valor = valor;
		this.tipoPagamento = tipoPagamento;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDateTime getDataFinal() {
		return dataFinal;
	}
	
	public void setDataFinal(LocalDateTime dataFinal) {
		this.dataFinal = dataFinal;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public TipoPagamento getTipoPagamento() {
		return tipoPagamento;
	}
	
	public void setTipoPagamento(TipoPagamento tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
	
	public long getId() {
		return id;
	}
	
	public LocalDate getDataInicial() {
		return dataInicial;
	}	
	
}
