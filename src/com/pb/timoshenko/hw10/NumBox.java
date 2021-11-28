package com.pb.timoshenko.hw10;

public class NumBox <T extends Number>{
    private T[] num;

    public sizeNumArray (int size){
        num = (T[]) new Number[size];
    }

    public T get (int index){
        return num[index];
    }

    public void setNum (int index, T num){
        this.num[index] = num;
    }
    ///////////////////////////////////////////////////////////
    void add(T t) throws Exception {
        if(this.filled >= this.numbers.length){
            throw new Exception("Array already filled!");
        }
        this.numbers[this.filled] = t;
        this.filled++;
    }

    public double sum() {
        double sum = 0.0;
        for(T i : numbers){
            if(i == null){
                sum+=0;
            } else sum+=i.doubleValue();
        }
        return sum;
    }

    public double average(){
        double avеrage = (sum()/length());
        return avеrage;
    }

    public T max(){
        T maX = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i].doubleValue() > maX.doubleValue()) {
                maX = numbers[i];
            }
        }
        return maX;
    }
}
