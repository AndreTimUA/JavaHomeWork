package com.pb.timoshenko.hw8;

public class WrongLoginException extends Exception{

    public WrongLoginException(String error) {
        System.out.println(error);
    }
}
