package infonal.PayDayBank.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;


import infonal.PayDayBank.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {
	 Product findById(int Id);
	

	  
	 

}
