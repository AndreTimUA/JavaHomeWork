package com.pb.timoshenko.hw10;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("-----------Integer-------------");
        NumBox<Integer> numInteger = new NumBox<Integer>(5);
        System.out.println("Create array:");
        numInteger.add(1);
        numInteger.add(2);
        numInteger.add(3);
        numInteger.add(4);
        numInteger.add(111);
        numInteger.printArray();
        System.out.print("Try add element's array - ");
        try {
            numInteger.add(7);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.print("Average - ");
        System.out.println(numInteger.average());
        System.out.print("Sum - ");
        System.out.println(numInteger.sum());
        System.out.print("Max element - ");
        System.out.println(numInteger.max());
        System.out.println();

        System.out.println("-----------Float-------------");
        NumBox<Float> numDouble = new NumBox<Float>(6);
        System.out.println("Create array:");
        numDouble.add(1.0f);
        numDouble.add(2.4f);
        numDouble.add(36.01f);
        numDouble.add(4.5f);
        numDouble.add(10.8f);
        numDouble.printArray();
        System.out.print("Try add element's array - ");
        try {
            numDouble.add(7.8f);
            System.out.println("OK");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        System.out.print("Average - ");
        System.out.println(numDouble.average());
        System.out.print("Sum - ");
        System.out.println(numDouble.sum());
        System.out.print("Max element - ");
        System.out.println(numDouble.max());
    }
}
