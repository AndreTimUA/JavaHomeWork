package com.pb.timoshenko.hw3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array: ");
        int[] array = new int[10];
        for (int i=0; i<10; i++){
            System.out.print("Enter " + i + " element - ");
            array[i] = sc.nextInt();
        }
        System.out.print("Array: ");
        for (int num : array){
            System.out.print(num + " ");
        }
        System.out.println();
        int sum = 0;
        for (int num : array){
            sum += num;
        }
        System.out.println("Sum: " + sum);

        int count = 0;
        for (int num : array){
            if (num>0)
                count++;
        }
        System.out.println("Positive numbers: " + count);

        int tmp;
        for (int a=0; a<array.length; a++){
            tmp = array[0];
            for (int i=1; i<(array.length-a); i++){
                if (tmp>array[i]){
                    tmp = array[i-1];
                    array[i-1] = array[i];
                    array[i] = tmp;
                }
                else
                    tmp = array[i];
            }
        }
        System.out.print("Sort array: ");
        for (int num : array){
            System.out.print(num + " ");
        }
    }

}
