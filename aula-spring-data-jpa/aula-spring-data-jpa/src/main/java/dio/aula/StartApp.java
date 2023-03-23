package dio.aula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.aula.model.User;
import dio.aula.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
	private UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {
		User user=new User();
		user.setName("Michael Soares");
		user.setUserName("MichaelXP");
		user.setPassword("93603312");
		
		userRepository.save(user);
		
		userRepository.findAll().stream().forEach(System.out::println);
		
	}
    
}
