package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {
	
	private DepartmentDao dao = DaoFactory.createDepartmentDao(); 
	
	public List<Department> findAll() {
		return dao.findAll();
	}
	
	// Fun��o para salvara ou atualizar um departamento
	public void saveOrUpadate(Department obj) {
		if (obj.getId() == null) {
			dao.insert(obj);
		}
		else {
			dao.update(obj);
		}
	}
	
	// Fun��o para remover um departamento
	public void remove(Department obj) {
		dao.deleteById(obj.getId());
	}
}
