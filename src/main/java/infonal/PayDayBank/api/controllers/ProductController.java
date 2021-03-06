
package infonal.PayDayBank.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import infonal.PayDayBank.business.abstracts.ProductService;
import infonal.PayDayBank.core.utilitis.results.DataResult;
import infonal.PayDayBank.core.utilitis.results.Result;
import infonal.PayDayBank.entities.dtos.ProductDto;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/products")
@CrossOrigin
public class ProductController {
	
	private ProductService productService;
	
	

	@Autowired
	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}





	@GetMapping("/getall")
	public DataResult<List<ProductDto>> getAll(){
		return this.productService.getall();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody ProductDto productDto) {
		return this.productService.add(productDto);
	}
	
	@PutMapping("/update")
	public Result updateProduct(@RequestBody ProductDto productDto){
		return this.productService.updateProduct(productDto);
	}
	
	@GetMapping("/getByProducId")
	public DataResult<ProductDto > getByProductId(@RequestParam int productId){
		return this.productService.getByProductId(productId);
	}
	@DeleteMapping("/delete")
	public Result delete(@RequestParam int id)
	{
		return this.productService.delete(id);
	}

}



















