package com.cibertec.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.models.personal;
import com.cibertec.repositories.IPersonalRepository;

@Service
public class PersonalService {
	@Autowired
	private IPersonalRepository personalRepository;
	public List<personal> buscarporcodigo(int codigo){
		return personalRepository.findByCodigo(codigo);
		
	}
	public List<personal> buscartodos(){
		return personalRepository.findAll();
		
	}
	public personal getOnePersonal(Long id) {
		Optional<personal> personalResult = personalRepository.findById(id);
		
		return personalResult.isPresent()?personalResult.get():null;
	}
	public personal guardarPersonal(personal newPersonal) {
		return personalRepository.save(newPersonal);
	}

}
