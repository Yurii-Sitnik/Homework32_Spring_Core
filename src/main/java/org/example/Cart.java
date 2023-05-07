package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("cartBean")
@Scope("prototype")
public class Cart {

    private ProductRepository repository;


    @Autowired
    public Cart(ProductRepository productRepository) {
        this.repository = productRepository;
    }

    public void addProduct(Product product) {
        repository.getProductList().add(product);
        System.out.println("product "+product.getName()+" added");
    }

    public void deleteById(int id) {
        repository.getProductList().remove(id);
        System.out.println("product " + id + " deleted");
    }



}
