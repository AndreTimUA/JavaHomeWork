package com.pb.timoshenko.hw6;

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
    public String toString() {
        return "Cat to string";
    }

    public boolean equals() {
        return true;
    }

    public int hashCode() {
        return 12345;
    }
}
