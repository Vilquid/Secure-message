package ku.message.service;

import ku.message.model.User;
import ku.message.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class AuthenticationService implements AuthenticationProvider
{
	@Autowired
	private UserRepository repository;

	@Autowired
	private HashService hashService;

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException
	{
		String username = authentication.getName();
		String password = authentication.getCredentials().toString();
		User user = repository.findByUsername(username);

		if (user != null)
		{
			String salt = user.getSalt();
			String hashedPassword = hashService.getHashedValue(password, salt);

			if (user.getPassword().equals(hashedPassword))
			{
				return new UsernamePasswordAuthenticationToken(username, password, new ArrayList<>());
			}
		}

		return null;
	}

	@Override
	public boolean supports(Class<?> authentication)
	{
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}
}