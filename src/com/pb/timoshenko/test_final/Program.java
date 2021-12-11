package com.pb.timoshenko.test_final;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pb.timoshenko.test.Book;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) throws Exception {
//        ./src/com/pb/timoshenko/test/book.json


        try {
            // create object mapper instance
            ObjectMapper mapper = new ObjectMapper();

            // convert JSON array to list of books
            List<Person> books = Arrays.asList(mapper.readValue(Paths.get("./src/com/pb/timoshenko/test_final/personsImport.json").toFile(), Person[].class));

            // print books
            books.forEach(System.out::println);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}