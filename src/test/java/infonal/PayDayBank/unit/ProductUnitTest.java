package infonal.PayDayBank.unit;

import static org.junit.jupiter.api.Assertions.assertSame;

import org.mockito.Mockito;
import org.testng.annotations.Test;


import infonal.PayDayBank.business.concretes.ProductManager;
import infonal.PayDayBank.dataAccess.abstracts.ProductDao;
import infonal.PayDayBank.entities.concretes.Product;

public class ProductUnitTest {
	
	@Test
	public void TestProductGetById()
	{
		 final var productDao = Mockito.mock(ProductDao.class);
		    final var productManager = new ProductManager(productDao);
		    // Yeni bir entity üretelim
		    final var expectedResult = new Product(138,"bilgisayar",7000,true,"500gb ssd intel");
		    Mockito.doReturn(expectedResult)
		        .when(productDao)
		        .save(Mockito.any(Product.class));
		    //getbyıd den gelen bilgileri alalım
		    final var actualResult = productManager.getByProductId(138);
		    // Şimdi ise gelen entity'deki content'in eşitliğini kontrol edelim	
		    assertSame(expectedResult, actualResult);
	}
	
	@Test
	public void TestGetAll()
	{
		final var productDao = Mockito.mock(ProductDao.class);
		final var productManager = new ProductManager(productDao);
		 // Yeni bir entity üretelim
		final var expectedResult = new  Product();
	    Mockito.doReturn(expectedResult)
        .when(productDao)
        .save(Mockito.any(Product.class));
	  //getall den gelen bilgileri alalım
    final var actualResult = productManager.getall();
    // Şimdi ise gelen entity'deki content'in eşitliğini kontrol edelim	
    assertSame(expectedResult, actualResult);
	}
	
	
	
	
}
