package ku.message.service;

import ku.message.model.User;
import ku.message.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
	@Autowired
	private UserRepository repository;

	@Autowired
	private HashService hashService;
	public boolean isUsernameAvailable(String username)
	{
		//
		return repository.findByUsername(username) == null;
	}

	public int createUser(User user)
	{
		User newUser = new User();

		newUser.setFirstName(user.getFirstName());
		newUser.setLastName(user.getLastName());
		newUser.setUsername(user.getUsername());

		String salt = hashService.getSalt();
		String hashedPassword = hashService.getHashedValue((String) user.getPassword(), salt);

		newUser.setSalt(salt);
		newUser.setPassword(hashedPassword);

		repository.save(newUser);

		return 1;
	}

	public User getUser(String username)
	{
		return repository.findByUsername(username);
	}
}