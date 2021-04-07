package cl.falabell.test.products.models.dao;

import cl.falabell.test.products.models.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDAO extends JpaRepository<Product, Long> {

}
