 package com.example.demo.repository.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "materia")
public class Materia {
	
	@SequenceGenerator(name = "seq_materia",sequenceName = "seq_materia",allocationSize = 1)
	@GeneratedValue(generator = "seq_materia",strategy = GenerationType.SEQUENCE)
	
	@Id
	@Column(name = "mat_id")
	private Integer id;
	

	@Column(name = "mat_nombre")
	private String nombre;
	

	@Column(name = "mat_codigo")
	private String codigo;
	

	@Column(name = "mat_num_creditos")
	private Integer numCreditos;
	

	@Column(name = "mat_cedula_profesor")
	private String cedProfesor;
	
	@OneToMany(mappedBy = "materia")
	private List<Matricula> matriculas;
	
	//set y get

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Integer getNumCreditos() {
		return numCreditos;
	}

	public void setNumCreditos(Integer numCreditos) {
		this.numCreditos = numCreditos;
	}

	public String getCedProfesor() {
		return cedProfesor;
	}

	public void setCedProfesor(String cedProfesor) {
		this.cedProfesor = cedProfesor;
	}

	public List<Matricula> getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(List<Matricula> matriculas) {
		this.matriculas = matriculas;
	}
	
	
	
	
	

}
