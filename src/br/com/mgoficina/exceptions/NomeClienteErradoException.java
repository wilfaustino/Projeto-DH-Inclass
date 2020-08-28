package br.com.mgoficina.exceptions;

public final class NomeClienteErradoException extends RuntimeException {

	private static final long serialVersionUID = 1L;	
	
	public NomeClienteErradoException(String msg){
		super(msg);
	}
	
}
