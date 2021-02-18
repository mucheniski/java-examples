package domains;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Employee {

	private Integer id;
	private String name;
	private String city;
	private String email;
	private Double salary;
	
}
