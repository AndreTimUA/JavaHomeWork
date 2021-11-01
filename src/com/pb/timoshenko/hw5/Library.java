package com.pb.timoshenko.hw5;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book [5];
        books[0] = new Book ("Приключения","Иванов И. И.", 2000);
        books[1] = new Book ("Словарь", "Сидоров А. В.", 1980);
        books[2] = new Book ("Энциклопедия", "Гусев К. В.",2010);
        books[3] = new Book("Журнал", "Евсеев А. Н.",2019);
        books[4] = new Book("Газета", "Инев К. А.",2018);

        Reader[] readers = new Reader[3];
        readers[0] = new Reader("Петров В.В.", 352, "физический", "25.05.1999","+380675687421");
        readers[1] = new Reader("Иванов С.Н.", 350, "мех.мат.", "11.08.1998","+380683682578");
        readers[2] = new Reader("Сергеев Ф.А.", 308, "мех.мат.", "22.09.1991","+380683662578");

        System.out.println("------------------------------------------");
        System.out.println("Список книг библиотеки:");
        for (Book book : books) {
            book.infoBook();
            System.out.println();
        }

        System.out.println("------------------------------------------");
        System.out.println("Список читателей:");
        for (Reader reader : readers) {
            System.out.println(reader.getName());
        }

        System.out.println("------------------------------------------");

        readers[0].takeBook(4);
        readers[1].takeBook(books[0].getName(), books[2].getName(), books[4].getName());
        readers[2].takeBook(books[1], books[3], books[2]);

        System.out.println("------------------------------------------");
        readers[0].returnBook(3);
        readers[1].returnBook(books[0].getName(), books[1].getName(), books[2].getName());
        readers[2].returnBook(books[3], books[4]);







    }
}
