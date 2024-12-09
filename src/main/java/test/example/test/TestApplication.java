package test.example.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import test.example.test.entity.Product;
import test.example.test.repository.ProductRepository;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(ProductRepository repository) {
		return (args) -> {
			// Save a few products
			repository.save(new Product(null, "Laptop", 1200.0));
			repository.save(new Product(null, "Smartphone", 800.0));
		};
	}
}
