package ku.message.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter
{
	@Override
	protected void configure(HttpSecurity http) throws Exception
	{
		http
				.authorizeRequests()
				.antMatchers("/home", "/css/**", "/js/**").permitAll()
				.anyRequest().authenticated();

		http.formLogin()
				.loginPage("/login")
				.defaultSuccessUrl("/message", true);
	}

//	@Autowired
//	public void configureGlobal(AuthentificationManagerBuilder auth) throws Exception
//	{
//		auth.inMemoryAuthentification()
//				.withUser("User")
//				.passwordEncoder(encoder().encode("passw0rd!"))
//				?roles("USER");
//	}
//
//	@Bean
//	public PasswordEncoder encoder()
//	{
//		return new BCryptPasswordEncoder();
//	}
}