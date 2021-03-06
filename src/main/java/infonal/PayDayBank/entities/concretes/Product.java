package infonal.PayDayBank.entities.concretes;
//entiti nesnelerini database ile ilişkilendirip işlemlerimize devam ediyoruz
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_id")
	private int id;
	
	@Column(name="product_name")
	private String name;
	
	@Column(name="product_price")
	private int price ;
	
	@Column(name="product_available")
	private Boolean available;
	
	@Column(name="product_description")
	private String description;
	
	public Product() {
		
	}
	
	public Product(int id, String name, int price, Boolean available, String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.available = available;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Boolean getAvailable() {
		return available;
	}
	public void setAvailable(Boolean available) {
		this.available = available;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}


}