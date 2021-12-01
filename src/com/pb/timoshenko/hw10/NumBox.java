package com.pb.timoshenko.hw10;

import java.lang.Number;

public class NumBox <T extends Number>{

    private T[] array;
    private int size;

    public NumBox (int size){
        this.array = (T[]) new Number[size];

    }

    public T get (int index){
        return array[index];
    }

    public void printArray (){
        for (T a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public int length() {
        int size = 0;
        for (T a : array) {
            if (a != null) {
                size++;
            }
        }
        return size;
    }

    public void add(T num) throws Exception {
        if (length() < array.length) {
            int s = 0;
            for (int i = 0; i < array.length; i++) {
                if (s < array.length) {
                    if (array[i] == null) {
                        array[i] = num;
                        break;
                    } else {
                        s++;
                    }
                }
            }
        } else {
            throw new Exception("Array's full!");
        }
    }

    public double sum() {
        double sum = 0.0;
        for (T a : array) {
            if (a != null)
                sum += a.doubleValue();
        }
        return sum;
    }

    public double average () {
        double res = (sum()/length());
        return res;
    }

    public T max(){
        T max = array[0];
        for(T a : array){
            if( a.doubleValue() > max.doubleValue()) {
                max = a;
            }
        }
        return max;
    }

}
