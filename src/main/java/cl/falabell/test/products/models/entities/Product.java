package cl.falabell.test.products.models.entities;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
import java.util.Objects;

@Entity
public class Product {

    private @Id long sku;
    private String name;
    private String brand;
    private String size;
    private int prize;
    private String principaImage;
    @ElementCollection
    private List<String> images;

    public Product() {
    }

    public Product(long sku, String name, String brand, String size, int prize, String principaImage, List<String> images) {
        this.sku = sku;
        this.name = name;
        this.brand = brand;
        this.size = size;
        this.prize = prize;
        this.images = images;
        this.principaImage = principaImage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return sku == product.sku && prize == product.prize && name.equals(product.name) && brand.equals(product.brand) && Objects.equals(size, product.size) && principaImage.equals(product.principaImage) && Objects.equals(images, product.images);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sku, name, brand, size, prize, principaImage, images);
    }

    @Override
    public String toString() {
        return "Product{" +
                "sku=" + sku +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", size='" + size + '\'' +
                ", prize=" + prize +
                ", principaImage='" + principaImage + '\'' +
                ", images=" + images +
                '}';
    }
}
