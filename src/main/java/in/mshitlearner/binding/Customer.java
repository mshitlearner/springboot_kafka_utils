package in.mshitlearner.binding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {
	
	private Integer custId;
	private String custName;
	private Integer age;
	private String emailId;
	
}
