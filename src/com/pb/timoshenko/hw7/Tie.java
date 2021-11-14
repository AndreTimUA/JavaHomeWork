package com.pb.timoshenko.hw7;

public class Tie extends Clothes implements ManClothes{
    public Tie(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Tie: size - " + size.getEuroSize()+", price - " + price + ", color - " + color);
    }
}
