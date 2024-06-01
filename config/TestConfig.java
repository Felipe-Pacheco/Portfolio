package br.com.felipe.crud.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.felipe.crud.entities.User;
import br.com.felipe.crud.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Ellie Williams", "ellie@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Joel Miller", "joel@gmail.com", "977777777", "123456");

		userRepository.saveAll(Arrays.asList(u1, u2));

	}

}
