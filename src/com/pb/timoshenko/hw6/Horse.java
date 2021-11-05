package com.pb.timoshenko.hw6;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Horse{" +
                "voice Horse='" + voiceHorse + '\'' +
                ", alias =" + aliasHorse +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Objects.equals(voiceHorse, horse.voiceHorse) && Objects.equals(aliasHorse, horse.aliasHorse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(voiceHorse, aliasHorse);
    }
}
