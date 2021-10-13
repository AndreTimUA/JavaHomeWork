package com.pb.timoshenko.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int operand1 = sc.nextInt();
        System.out.println("Enter second number:");
        int operand2 = sc.nextInt();
        System.out.println("Enter sign:");
        String sign = sc.next();

        switch (sign){
            case("+"):
                System.out.println(operand1 + " + " + operand2 + " = " + (operand1+operand2));
                break;
            case("-"):
                System.out.println(operand1 + " - " + operand2 + " = " + (operand1-operand2));
                break;
            case("*"):
                System.out.println(operand1 + " * " + operand2 + " = " + (operand1*operand2));
                break;
            case("/"):
                if (operand2==0){
                    System.out.println("Error");
                }
                else {
                    System.out.println(operand1 + " / " + operand2 + " = " + (operand1*1.0/operand2));
                }
                break;

        }
    }
}
