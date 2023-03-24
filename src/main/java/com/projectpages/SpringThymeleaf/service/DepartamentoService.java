package com.projectpages.SpringThymeleaf.service;

import java.util.List;

import com.projectpages.SpringThymeleaf.domain.Departamento;

public interface DepartamentoService {

	void salvar(Departamento departamento);
	
	void editar(Departamento departamento);
	
	void excluir(Long id);
	
	Departamento buscarPotId(Long id);
	
	List<Departamento> buscarTodos();

}
