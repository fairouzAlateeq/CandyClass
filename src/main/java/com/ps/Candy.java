package com.ps;

public class Candy {
    private String name;
    private float price;
    private String  flavor;
    private short quant;


    public Candy(String name, float price, String flavor, short quant) {
        this.name = name;
        this.price = price;
        this.flavor = flavor;
        this.quant = quant;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public short getQuant() {
        return quant;
    }

    public void setQuant(short quant) {
        this.quant = quant;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "name='" + name + '\'' +
                ", flavor='" + flavor + '\'' +
                ", quant=" + quant +
                ", price=" + price +
                '}';
    }
}
