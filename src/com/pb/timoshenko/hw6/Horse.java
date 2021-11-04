package com.pb.timoshenko.hw6;

public class Horse extends Animal{

    private String voiceHorse;
    private String aliasHorse;

    public Horse(String voiceHorse, String aliasHorse, String food, String location) {
        this.voiceHorse = voiceHorse;
        this.aliasHorse = aliasHorse;
        setFood(food);
        setLocation(location);
    }

    public void setVoiceHorse(String voiceHorse) {
        this.voiceHorse = voiceHorse;
    }

    public void setAliasHorse(String aliasHorse) {
        this.aliasHorse = aliasHorse;
    }

    public String getVoiceHorse() {
        return voiceHorse;
    }

    public String getAliasHorse() {
        return aliasHorse;
    }

    public void makeNoise (){
        System.out.println("Hrr hrr hrr!!!");
    }

    public void eat() {
        System.out.println("Horse eating...");
    }

    public String toString() {
        return "Horse to string";
    }

    public void equals() {
        System.out.println("Horse to equals");
    }

    public int hashCode() {
        return 12345;
    }
}
