package test.example.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.example.test.entity.Product;

public interface ProductRepository extends JpaRepository<Product , Long> {

}
