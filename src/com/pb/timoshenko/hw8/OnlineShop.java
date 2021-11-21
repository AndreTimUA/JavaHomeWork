package com.pb.timoshenko.hw8;

import java.util.Scanner;

public class OnlineShop {

    public static void main(String[] args) {
        Auth auth = new Auth ();

        System.out.println("Welcome to OnlineShop!");
        System.out.println("Please create you login and password:");

        Scanner sc = new Scanner(System.in);
        System.out.print("Create LOGIN - ");
        String login = sc.nextLine();

        System.out.print("Create PASSWORD - ");
        String pass = sc.nextLine();
        System.out.print("Confirm PASSWORD - ");
        String passConfirm = sc.nextLine();

        try {
            auth.signUp(login, pass, passConfirm);
        } catch (WrongLoginException ex) {
            System.out.println("WRONG! Create correct LOGIN - " + ex);
            return;
        } catch (WrongPasswordException ex){
            System.out.println("WRONG! Create correct PASSWORD - " + ex);
            return;
        }

        System.out.println("-----------------------------------------");
        System.out.print("Enter YOUR LOGIN - ");
        String loginCheck = sc.nextLine();

        System.out.print("Enter YOUR PASSWORD - ");
        String passCheck = sc.nextLine();


        try {
            auth.signIn(loginCheck, passCheck);
        }  catch (WrongLoginException ex) {
            System.out.println("WRONG! Enter LOGIN or PASSWORD! Try again! " + ex);
        }

    }
}
