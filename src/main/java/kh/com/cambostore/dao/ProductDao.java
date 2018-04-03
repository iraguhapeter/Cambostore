package kh.com.cambostore.dao;

import kh.com.cambostore.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    private List<Product> productList;

    public List<Product> getProductList() {
        Product product1 = new Product();
        product1.setProductName("Iphone 7 plus");
        product1.setProductCategory("iPhone");
        product1.setProductDescription("This is the new iPhone 7 plus");
        product1.setProductPrice(1200);
        product1.setProductCondition("New arrival");
        product1.setProductStatus("Active");
        product1.setUnitStock(20);
        product1.setProductManufacturer("Apple");

        Product product2 = new Product();
        product2.setProductName("Iphone 7 plus");
        product2.setProductCategory("iPhone");
        product2.setProductDescription("This is the new iPhone 7 plus");
        product2.setProductPrice(1200);
        product2.setProductCondition("New arrival");
        product2.setProductStatus("Active");
        product2.setUnitStock(20);
        product2.setProductManufacturer("Apple");

        Product product3 = new Product();
        product3.setProductName("Samsung Galaxy Edge");
        product3.setProductCategory("Samsung");
        product3.setProductDescription("This is the new Samsung Galaxy Edge");
        product3.setProductPrice(1200);
        product3.setProductCondition("New arrival");
        product3.setProductStatus("Active");
        product3.setUnitStock(20);
        product3.setProductManufacturer("Samsung");

        Product product4 = new Product();
        product4.setProductName("Samsung Galaxy Edge");
        product4.setProductCategory("Samsung");
        product4.setProductDescription("This is the new Samsung Galaxy Edge");
        product4.setProductPrice(1200);
        product4.setProductCondition("New arrival");
        product4.setProductStatus("Active");
        product4.setUnitStock(20);
        product4.setProductManufacturer("Samsung");

        Product product5 = new Product();
        product5.setProductName("Samsung Galaxy Edge");
        product5.setProductCategory("Samsung");
        product5.setProductDescription("This is the new Samsung Galaxy Edge");
        product5.setProductPrice(1200);
        product5.setProductCondition("New arrival");
        product5.setProductStatus("Active");
        product5.setUnitStock(20);
        product5.setProductManufacturer("Samsung");

        productList = new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);

        return productList;
    }



}
