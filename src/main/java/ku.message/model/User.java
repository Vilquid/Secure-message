package ku.message.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String username;
	private String password;
	private String salt;
	private String firstName;
	private String lastName;

	public Object getPassword() {
	}
	// .... generate getter/setter for all attributes
}