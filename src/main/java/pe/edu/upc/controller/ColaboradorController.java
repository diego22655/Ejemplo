package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Colaborador;
import pe.edu.upc.service.IColaboradorService;

@Named
@RequestScoped
public class ColaboradorController implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IColaboradorService cS;
	
	private Colaborador colaborador;
	
	List<Colaborador> listaColaboradores;
	
	@PostConstruct
	public void init() {
		this.listaColaboradores = new ArrayList<Colaborador>();
		this.colaborador = new Colaborador();
		this.list();
	}
	
	public String newColaborador() {
		this.setColaborador(new Colaborador());
		return "colaborador.xhtml";
	}
	
	public void insert() {
		cS.insert(colaborador);
		this.clean();
		this.list();
	}
	
	public void list() {
		listaColaboradores = cS.list();
	}
	
	public void clean() {
		this.init();
	}
	
	public void findByName() {
		if (colaborador.getNombreCompleto().isEmpty())
			this.list();
		else
			listaColaboradores = this.cS.findByNameColaborador(this.getColaborador());
	}

	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public List<Colaborador> getListaColaboradores() {
		return listaColaboradores;
	}

	public void setListaColaboradores(List<Colaborador> listaColaboradores) {
		this.listaColaboradores = listaColaboradores;
	}

	
	
}
