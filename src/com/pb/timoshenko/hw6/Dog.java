package com.pb.timoshenko.hw6;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Dog{" +
                "voice Dog='" + voiceDog + '\'' +
                ", alias =" + aliasDog +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(voiceDog, dog.voiceDog) && Objects.equals(aliasDog, dog.aliasDog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(voiceDog, aliasDog);
    }

}
