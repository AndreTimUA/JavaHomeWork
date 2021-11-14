package com.pb.timoshenko.hw7;

public class Pants extends Clothes implements ManClothes, WomenClothes{
    public Pants(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Pants: size - " + size.getEuroSize()+", price - " + price + ", color - " + color);
    }

    @Override
    public void dressWomen() {
        dressMan();
    }
}
