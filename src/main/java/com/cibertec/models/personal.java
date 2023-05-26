package com.cibertec.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "personal")
public class personal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "nombre_personal")
	String nombreP;
	
	@Column(name = "codigo_personal")
	int idP;
	
	@Column(name = "sueldo_personal")
	String sueldo;
	
	@Column(name = "codigo_area")
	int id;
	
 
}
