package com.projectpages.SpringThymeleaf.service;

import java.util.List;

import com.projectpages.SpringThymeleaf.domain.Funcionario;

public interface FuncionarioService {

	void salvar(Funcionario funcionario);
	
	void editar(Funcionario funcionario);
	
	void excluir(Long id);
	
	Funcionario buscarPotId(Long id);
	
	List<Funcionario> buscarTodos();
}
