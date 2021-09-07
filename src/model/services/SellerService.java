package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class SellerService {
	
	private SellerDao dao = DaoFactory.createSellerDao(); 
	
	public List<Seller> findAll() {
		return dao.findAll();
	}
	
	// Fun��o para salvar ou atualizar um Seller
	public void saveOrUpadate(Seller obj) {
		if (obj.getId() == null) {
			dao.insert(obj);
		}
		else {
			dao.update(obj);
		}
	}
	
	// Fun��o para remover um Seller
	public void remove(Seller obj) {
		dao.deleteById(obj.getId());
	}
}
