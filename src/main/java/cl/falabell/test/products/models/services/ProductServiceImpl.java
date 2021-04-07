package cl.falabell.test.products.models.services;

import cl.falabell.test.products.models.dao.ProductDAO;
import cl.falabell.test.products.models.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductDAO productDao;

    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return (List<Product>) productDao.findAll();
    }

    @Override
    public Product save(Product product) {
        return productDao.save(product);
    }

 }
