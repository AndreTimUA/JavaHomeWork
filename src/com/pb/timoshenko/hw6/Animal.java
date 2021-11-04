package com.pb.timoshenko.hw6;

public class Animal {
    private String food;
    private String location;

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    void makeNoise(){
        System.out.println("Animals noise");
    }

    public void eat(){
        System.out.println("Animals eating");
    }

    public void sleep(){
        System.out.println("Animals sleeping");
    }
}
