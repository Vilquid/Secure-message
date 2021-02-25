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

	private String firstName;
	private String lastName;

	private String getUsername;
	// ... generate getter/setter for all attributes
}