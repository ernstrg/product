package cl.falabell.test.products.models.services;

import cl.falabell.test.products.models.entities.Product;

import java.util.List;

public interface ProductService {

    public List<Product> findAll();

    public Product save(Product product);
}
