package com.pb.timoshenko.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class CapitalLetter {

    static char[] bigLetter (String str){
        char[] chArray = str.toCharArray();
        chArray[0] = Character.toUpperCase(chArray[0]);
        return chArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] partsText = text.split(" ");

        StringBuilder resText = new StringBuilder();
        for (String part:partsText){
            resText.append(bigLetter(part)).append(" ");
            }
        resText.deleteCharAt(resText.length()-1);
        System.out.println(resText);
        }
}