package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IColaboradorDao;
import pe.edu.upc.entity.Colaborador;
import pe.edu.upc.service.IColaboradorService;

@Named
@RequestScoped

public class ColaboradorServiceImpl implements IColaboradorService{

	@Inject
	private IColaboradorDao cD;
	
	@Override
	public void insert(Colaborador c) {
		cD.insert(c);
	}

	@Override
	public List<Colaborador> list() {
		return cD.list();
	}

	@Override
	public List<Colaborador> findByNameColaborador(Colaborador c) {
		return cD.findByNameColaborador(c);
	}
	

}
