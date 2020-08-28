package br.com.mgoficina.model;

public class Veiculo {

	private long id;
	private String placa;
	private String modelo;
	private int ano;
	private String cor;
	private String chassis;
	private String tipo;
	
	public Veiculo(Long id, String placa, String modelo, int ano, String cor, String chassis, String tipo) {
		this.placa = placa;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.chassis = chassis;
		this.tipo = tipo;
	}

	public Long getId() {
		return id;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getChassis() {
		return chassis;
	}
	
	public void setChassis(String chassis) {
		this.chassis = chassis;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
