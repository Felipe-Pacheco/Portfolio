package br.com.felipe.crud.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Object id) {
		super("Não foi localizado nenhum usuário com a id " + id);
	}
}
