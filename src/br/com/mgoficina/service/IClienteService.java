package br.com.mgoficina.service;

import java.util.Set;

import br.com.mgoficina.exceptions.ClienteNaoEncontradoException;
import br.com.mgoficina.exceptions.NomeClienteErradoException;
import br.com.mgoficina.model.Cliente;

public interface IClienteService {

	public Cliente create(Cliente cliente) throws NomeClienteErradoException;
	public Cliente findClienteById(long id) throws ClienteNaoEncontradoException;
	public Cliente findClienteByNome(String nome) throws ClienteNaoEncontradoException;
	public Set<Cliente> findAll();
	public boolean updateCliente(Cliente cliente) throws ClienteNaoEncontradoException;
	public boolean deleteClienteByID(long id) throws ClienteNaoEncontradoException;
	
}