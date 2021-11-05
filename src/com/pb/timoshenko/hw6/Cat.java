package com.pb.timoshenko.hw6;

import java.util.Objects;

public class Cat extends Animal{

    private String voiceCat;
    private String aliasCat;

    public Cat(String voiceCat, String aliasCat, String food, String location) {
        this.voiceCat = voiceCat;
        this.aliasCat = aliasCat;
        setFood(food);
        setLocation(location);
    }

    public String getVoiceCat() {
        return voiceCat;
    }

    public String getAliasCat() {
        return aliasCat;
    }

    public void setVoiceCat(String voiceCat) {
        this.voiceCat = voiceCat;
    }

    public void setAliasCat(String aliasCat) {
        this.aliasCat = aliasCat;
    }

    public void makeNoise (){
        System.out.println("Myau myau myau!!!");
    }

    public void eat() {
        System.out.println("Cat eating...");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "voice Cat='" + voiceCat + '\'' +
                ", alias =" + aliasCat +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(voiceCat, cat.voiceCat) && Objects.equals(aliasCat, cat.aliasCat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(voiceCat, aliasCat);
    }
}
