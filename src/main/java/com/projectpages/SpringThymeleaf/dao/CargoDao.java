package com.projectpages.SpringThymeleaf.dao;

import java.util.List;

import com.projectpages.SpringThymeleaf.domain.Cargo;
import com.projectpages.SpringThymeleaf.domain.Departamento;

public interface CargoDao {
	
	void save(Cargo cargo);
	
	void update(Cargo cargo);
	
	void delete(Long id);
	
	Cargo findById(Long id);
	
	List<Cargo> findAll();
}
