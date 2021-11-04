package com.pb.timoshenko.hw6;

public class Dog extends Animal{

    private String voiceDog;
    private String aliasDog;

    public Dog(String voiceDog, String aliasDog, String food, String location) {
        this.voiceDog = voiceDog;
        this.aliasDog = aliasDog;
        setFood(food);
        setLocation(location);
    }

    public String getVoiceDog() {
        return voiceDog;
    }

    public String getAliasDog() {
        return aliasDog;
    }

    public void setVoiceDog(String voiceDog) {
        this.voiceDog = voiceDog;
    }

    public void setAliasDog(String aliasDog) {
        this.aliasDog = aliasDog;
    }

    public void makeNoise (){
        System.out.println("Gav gav gav!!!");
    }

    public void eat() {
        System.out.println("Dog eating ...");
    }

    public String toString() {
        return "sdhfhjkfj";
    }

    public void equals() {
        System.out.println("sdhfhjkfj");
    }

    public int hashCode() {
        return 12345;
    }
}
