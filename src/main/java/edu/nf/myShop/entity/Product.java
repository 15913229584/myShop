package edu.nf.myShop.entity;

/**
 * @author 沧海归心心不眠
 */
public class Product {

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    private String name ;
    private Double price;
}
