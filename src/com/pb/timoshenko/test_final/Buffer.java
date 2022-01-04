package com.pb.timoshenko.test_final;

import java.util.LinkedList;
import java.util.Random;

public class Buffer {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    private LinkedList <Integer> buffer = new LinkedList<>();
    private volatile boolean running = true;

    public synchronized void get() {
        while (running) {
            while (buffer.size() < 1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                          }
            }
            buffer.remove();
            System.out.println(ANSI_RED + "Remove element" + ANSI_RESET);
            System.out.println(buffer);
            notify();
        }
    }

    public synchronized void put() {
        while (running) {
            while (buffer.size() >= 5) {
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }
            buffer.add(new Random().nextInt(100));
            System.out.println(ANSI_GREEN + "Add new element to LinkedList" + ANSI_RESET);
            System.out.println(buffer);
            notify();
        }
    }

    public void shutdown(){
        this.running = false;
    }
}
