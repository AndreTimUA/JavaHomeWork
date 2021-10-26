package com.pb.timoshenko.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    //удаление всех знаков припинания
    public static String rmPunct(String str) {
        String res = "";
        for (Character ch : str.toCharArray()) {
            if(Character.isLetterOrDigit(ch))
                res = res + ch;
        }
        return res;
    }

    //сортировка по алфавиту массива букв
    static char[] sorting (String str){
        char[] chArray = str.toCharArray();
        Arrays.sort(chArray);
        return chArray;
    }

    public static void main(String[] args) {
//        String test1 = ("Я в мире — сирота.").toLowerCase();
//        String test2 = ("Я в Риме — Ариост.").toLowerCase();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two phrases!");
        System.out.print("First phrases: ");
        String test1 = (sc.nextLine()).toLowerCase();
        System.out.print("Second phrases: ");
        String test2 = (sc.nextLine()).toLowerCase();
        char[] nTest1 = sorting(rmPunct(test1));
        char[] nTest2 = sorting(rmPunct(test2));

        if (Arrays.equals(nTest1, nTest2)){
            System.out.println("OK! It's anagram");
        }
        else {
            System.out.println("It isn't anagram");
        }
    }
}
