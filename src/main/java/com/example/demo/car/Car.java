package com.example.demo.car;

import lombok.*;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor

public class Car {


    private long id;
    private Type type;
    private String brand;
    private String model;;
    private double price;

    private double year;



    public long getId() {
        return id;
    }

    public Type getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public double getYear() {
        return year;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYear(double year){
        this.year = year;
    }

    public Car(long id, Type type, String brand, String model, double price) {
        this.id = id;
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.year = year;
    }
}
