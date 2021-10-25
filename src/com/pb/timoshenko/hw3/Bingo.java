package com.pb.timoshenko.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int rum = random.nextInt(101);
        int count = 0;
        System.out.println("Guess number from 0 to 100.");
        while(true){
            System.out.print("Enter number: ");
            String data = sc.next();
            if (data.equals("exit")){
                break;
            }
            int num = Integer.parseInt(data);
            count++;
            if (num != rum){
                if (num < rum){
                    System.out.println(num + " < ?");
                }
                else {
                    System.out.println(num + " > ?");
                }
            }
            else {
                System.out.println("You are WINNER - it's " + num + ". Number of attempts - " + count);
                break;
            }

        }
        System.out.println("Game over!");
    }
}