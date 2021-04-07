package cl.falabell.test.products;

import cl.falabell.test.products.models.dao.ProductDAO;
import cl.falabell.test.products.models.entities.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(ProductDAO productDAO) {

        return args -> {
            log.info("Preloading " + productDAO.save(new Product(
                    8406270, "500 Zapatilla Urbana Mujer", "NEW BALANCE", "37", 42990, "https://falabella.scene7.com/is/image/Falabella/8406270_1",null

            )));
            log.info("Preloading " + productDAO.save(new Product(
                    881952283, "Bicicleta Baltoro Aro 29", "JEEP", "ST", 399990, "https://falabella.scene7.com/is/image/Falabella/881952283_1",
                    Arrays.asList(new String[]{"https://falabella.scene7.com/is/image/Falabella/881952283_2"})
            )));
            log.info("Preloading " + productDAO.save(new Product(
                    881898502, "Camisa Manga Corta Hombre", "BASEMENT", "M", 24990,
                    "https://falabella.scene7.com/is/image/Falabella/881898502_1",null
            )));
        };
    }
}