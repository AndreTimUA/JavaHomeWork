package com.pb.timoshenko.hw11;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class PhonesBook {
    public static void main(String[] args) throws ParseException {
        System.out.println("|----------Welcome to Phone's Book!----------|");
        ArrayList<Person> persons = new ArrayList<>();
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number function:");
            System.out.println("1 - Add new contact\n" +
                    "2 - Remove contact\n" +
                    "3 - Search contact\n" +
                    "4 - View sorting contact\n" +
                    "5 - Edite contact\n" +
                    "6 - Save phone book in file *.json\n" +
                    "7 - Import phone book\n" +
                    "0 - EXIT!");
            int numComand = sc.nextInt();

            if (numComand == 1){
                Person person = new Person();
                person.createContact();
                persons.add(person);
            }
            if (numComand == 0) {
                break;
            }
        }

//
//  Create CONTACT
//
//        System.out.println("Add new contact:");
//        System.out.print("Enter Name - ");
//        String name = sc.nextLine();
//        person.setName(name);
//
//        System.out.print("Enter date birthday (format DD/MM/YYYY ) - ");
//        String strDateBirthday = sc.nextLine();
//        Date dateBirthday = formatDate.parse(strDateBirthday);
////        System.out.println(formatDate.format(dateBirthday));
//        person.setDateBirthday(dateBirthday);
//
//        System.out.print("Enter phone - ");
//        int phone = sc.nextInt();
//        person.setPhone(phone);
//
//        System.out.print("Enter address - ");
//        String address = sc.next();
//        person.setAddress(address);
//
//        System.out.print("Date create contact - " + formatDate.format(new Date()));
//        person.setDateEdit(new Date());
//        System.out.println();

        System.out.println(persons);

//        System.out.print("Enter phone - ");
//        int phone1 = sc.nextInt();
//        person.setPhone(phone);
//
//        System.out.println(person.toString());


    }
}
