package com.projectpages.SpringThymeleaf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectpages.SpringThymeleaf.dao.CargoDao;
import com.projectpages.SpringThymeleaf.domain.Cargo;


@Service 
public class CargoServiceImpl implements CargoService {
	
	@Autowired
	private CargoDao dao;

	@Override
	public void salvar(Cargo cargo) {
		dao.save(cargo);
	}

	@Override
	public void editar(Cargo cargo) {
		dao.update(cargo);
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override
	public Cargo buscarPotId(Long id) {
		return dao.findById(id);
	}

	@Override
	public List<Cargo> buscarTodos() {
		return dao.findAll();
	}

}
