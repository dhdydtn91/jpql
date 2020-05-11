package jpql;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue
    @Column(name = "PRODUCT_ID")
    private Long id;
    private String name;
    private int price;
    private int stockAount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStockAount() {
        return stockAount;
    }

    public void setStockAount(int stockAount) {
        this.stockAount = stockAount;
    }
}
