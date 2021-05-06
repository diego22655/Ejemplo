package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Colaboradores")
public class Colaborador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idColaborador;
	
	@Column(name = "nombreCompleto", nullable = false, length = 45)
	private String nombreCompleto;
	
	@Column(name = "peso")
	private double peso;
	
	@Column(name = "estatura")
	private double estatura;

	public Colaborador() {
		super();
	}

	public Colaborador(int idColaborador, String nombreCompleto, double peso, double estatura) {
		super();
		this.idColaborador = idColaborador;
		this.nombreCompleto = nombreCompleto;
		this.peso = peso;
		this.estatura = estatura;
	}

	public int getIdColaborador() {
		return idColaborador;
	}

	public void setIdColaborador(int idColaborador) {
		this.idColaborador = idColaborador;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	
	
}
