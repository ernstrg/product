package cl.falabell.test.products.controllers;

import cl.falabell.test.products.models.entities.Product;
import cl.falabell.test.products.models.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    List<Product> all()  throws customExecption {
        return productService.findAll();
    }

    @PostMapping("/products")
    Product newProduct(@RequestBody Product newProduct)  throws customExecption {
        return productService.save(newProduct);
    }

}
