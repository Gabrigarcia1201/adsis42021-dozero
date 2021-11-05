package com.unicesumar.adsis4s2021.dozero.meuTruck;

import java.util.List;
import java.util.NoSuchElementException;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unicesumar.adsis4s2021.dozero.base.RegistroJáExistente;
import com.unicesumar.adsis4s2021.dozero.base.RegistroNãoExistente;

@Service
@Transactional
public class TruckService {
	@Autowired
	private TruckRepository repo;
	
	
	public List<Truck> obterTodos() {
		return repo.findAll();
	}


	public Truck criar(Truck novo) {
		if (repo.findById(novo.getId()).isPresent()) {
			throw new RegistroJáExistente();
		}
		return repo.save(novo);
	}


	public void atualizar(Truck carro) {
		if (!repo.findById(carro.getId()).isPresent()) {
			throw new RegistroNãoExistente();
		}
		repo.save(carro);
	}


	public Truck obterPeloId(String id) {
		try {			
			return repo.findById(id).get();
		} catch (NoSuchElementException e) {
			throw new RegistroNãoExistente();
		}
	}


	public void excluirPeloId(String id) {
		try {			
			Truck recuperado = repo.findById(id).get();
			
			repo.delete(recuperado);
		} catch (NoSuchElementException e) {
			throw new RegistroNãoExistente();
		}
	}
	
}
