package domains;

import lombok.Data;

@Data
public class ProductLambda {

	private String id;
	private String name;
	private long price;
	private int quantity;
	private String manufacturer;
	
	public ProductLambda(String id, String name, long price, int quantity, String manufacturer) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.manufacturer = manufacturer;
	}
	
}
