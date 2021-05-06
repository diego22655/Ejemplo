package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Colaborador;

public interface IColaboradorDao {
	public void insert(Colaborador c);
	public List<Colaborador> list();
	public List<Colaborador> findByNameColaborador(Colaborador c);
}
