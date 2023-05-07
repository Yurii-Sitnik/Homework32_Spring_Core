package org.example;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext("org.example");
        Product avocado = new Product(1, "avocado", 10.10);
        Product orange = new Product(1, "orange", 20.20);
        Product banana = new Product(1, "banana", 30.30);
        Product kiwi = new Product(1, "kiwi", 40.40);

        Cart cart = applicationContext.getBean("cartBean", Cart.class);
        cart.addProduct(avocado);
        cart.addProduct(orange);
        cart.addProduct(banana);
        cart.addProduct(kiwi);

        cart.deleteById(3);
        applicationContext.close();
    }
}