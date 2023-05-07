package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {

    private List<Product> products = new ArrayList<>();


    public Product findById(int id) {
        return products.get(id);
    }

    public List<Product> getAll() {
        return products;
    }

    public List<Product> getProductList() {
        return products;
    }

}
