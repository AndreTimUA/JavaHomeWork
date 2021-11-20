package com.pb.timoshenko.hw8;

public class WrongPasswordException extends Exception {

    public WrongPasswordException(String error) {
        System.out.println(error);
    }
}
