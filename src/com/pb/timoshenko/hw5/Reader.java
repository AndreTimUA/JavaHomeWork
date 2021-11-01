package com.pb.timoshenko.hw5;

public class Reader {
    private String name;
    private int readerNum;
    private String faculty;
    private String birthday;
    private String phoneNum;

    public Reader(String name, int readerNum, String faculty, String birthday, String phoneNum){
        this.name = name;
        this.readerNum = readerNum;
    }
    public String getName(){
        return name;
    }

    public int getReaderNum(){
        return readerNum;
    }

    public String getFaculty(){
        return faculty;
    }

    public String getBirthday(){
        return birthday;
    }

    public String getPhoneNum(){
        return phoneNum;
    }
//---------------------------------------------------------------
    public void takeBook (int countBook){
        System.out.println(name + " взял " + countBook + " книги");
    }

    public void takeBook (String... namesBooks){
        System.out.print(name + " взял книги:");
        for (String book:namesBooks){
            System.out.print(" " + book + ",");
        }
        System.out.println("\b");
    }

    public void takeBook (Book... namesBooks){
        System.out.print(name + " взял книги: ");
        for (Book books:namesBooks){
            books.infoBook();
            System.out.print(", ");
        }
        System.out.println("\b\b");
    }
//---------------------------------------------------------------
public void returnBook (int countBook){
    System.out.println(name + " вернул " + countBook + " книги");
}

    public void returnBook (String... namesBooks){
        System.out.print(name + " вернул книги:");
        for (String book:namesBooks){
            System.out.print(" " + book + ",");
        }
        System.out.println("\b");
    }

    public void returnBook (Book... namesBooks){
        System.out.print(name + " вернул книги: ");
        for (Book books:namesBooks){
            books.infoBook();
            System.out.print(", ");
        }
        System.out.println("\b\b");
    }

}
