package com.pb.timoshenko.hw6;

import java.lang.reflect.Constructor;

public class VetClinic {
    public static void main(String[] args) throws Exception{

        Dog dog1 = new Dog ("Hav", "Bars", "meat", "Ukraine");
        Dog dog2 = new Dog ("Rav", "Boss", "meat", "Poland");
        Cat cat1 = new Cat ("Myau", "Muka", "fish", "England");
        Cat cat2 = new Cat ("Mur", "Lis", "meat", "Turkey");
        Horse horse1 = new Horse("Frr", "Volt", "oats", "Iran");
        Horse horse2 = new Horse("Prr", "Light", "corn", "UAE");

        Animal [] animals = new Animal[ ] {dog1, dog2, cat1, cat2, horse1, horse2};

        Class<?> vetClazz = Class.forName("com.pb.timoshenko.hw6.Veterinarian");
        Constructor<?> constr = vetClazz.getConstructor();
        Object obj = constr.newInstance();
        for (Animal anim:animals) {
            ((Veterinarian) obj).treatAnimal(anim);
        }
    }
}