package name.legkodymov.test.springcompose;

import name.legkodymov.test.springcompose.model.Post;
import name.legkodymov.test.springcompose.repository.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringComposeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringComposeApplication.class, args);
	}

	@Bean
    CommandLineRunner commandLineRunner(PostRepository repository) {
		return args -> repository.save(new Post("Hello, World!", "My first blog post"));
	}
}
