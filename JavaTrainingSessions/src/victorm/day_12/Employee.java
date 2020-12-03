package victorm.day_12;
import java.util.UUID;
import lombok.Data;

@Data
public class Employee {
	private String FirstName;
	private String LastName;
	private UUID Id;
	
	public Employee() {
		this.Id = UUID.randomUUID();
	}
}
