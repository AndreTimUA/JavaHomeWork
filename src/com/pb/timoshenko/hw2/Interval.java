package com.pb.timoshenko.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        if (a>=0 & a<=14){
            System.out.println("interval 0-14");
        }
        else if (a>=15 & a<=35){
            System.out.println("interval 15-35");
        }
        else if (a>=36 & a<=50){
            System.out.println("interval 36-50");
        }
        else if (a>=51 & a<=100){
            System.out.println("interval 51-100");
        }
        else {
            System.out.println("Error interval");
        }
    }
}
