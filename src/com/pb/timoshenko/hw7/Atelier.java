package com.pb.timoshenko.hw7;

import static javafx.scene.input.KeyCode.X;

public class Atelier{
    public static void main(String[] args) {

        Tshirt tshirt = new Tshirt( Size.XS,23,"red");
        Pants pants = new Pants(Size.S, 43,"green");
        Skirt skirt = new Skirt(Size.XXS, 3, "orange");
        Tie tie = new Tie(Size.M,56,"white");

        Clothes[] clothes = new Clothes[] {tshirt,pants,skirt,tie};

        for (Clothes part:clothes){
            if ((part instanceof WomenClothes)&&(part instanceof ManClothes)){
                System.out.println("Unisex clothing");
                ((ManClothes) part).dressMan();
            }
            else if (part instanceof WomenClothes){
                System.out.println("Women clothing");
                ((WomenClothes) part).dressWomen();
            }
            else if (part instanceof ManClothes){
                System.out.println("Man clothing");
                ((ManClothes) part).dressMan();
            }
            System.out.println();
        }
    }

}
