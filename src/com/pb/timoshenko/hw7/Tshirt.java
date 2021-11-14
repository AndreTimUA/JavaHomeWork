package com.pb.timoshenko.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes {
    public Tshirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Tshirt: size - " + size.getEuroSize()+", price - " + price + ", color - " + color);
    }

    @Override
    public void dressWomen() {
        dressMan();

    }
}
