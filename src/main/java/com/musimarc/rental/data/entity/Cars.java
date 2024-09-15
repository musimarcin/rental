package com.musimarc.rental.data.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cars {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String brand;
    private String model;
    private int production;
    private double engine;

    public Cars() {
    }

    public Cars(int id, String brand, String model, int production, double engine) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.production = production;
        this.engine = engine;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProduction() {
        return production;
    }

    public void setProduction(int production) {
        this.production = production;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }
}
