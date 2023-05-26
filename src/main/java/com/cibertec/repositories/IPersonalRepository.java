package com.cibertec.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.models.personal;
@Repository
public interface IPersonalRepository extends JpaRepository<personal,Long>{

	public List<personal> findAll();
	
	List<personal> findByCodigo(int codigo);
}
