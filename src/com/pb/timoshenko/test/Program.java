package com.pb.timoshenko.test;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program {
    public static void main(String[] args) throws Exception {
//        ./src/com/pb/timoshenko/test/book.json


        try {
            // create object mapper instance
            ObjectMapper mapper = new ObjectMapper();

            // convert JSON array to list of books
            List<Book> books = Arrays.asList(mapper.readValue(Paths.get("./src/com/pb/timoshenko/test/book.json").toFile(), Book[].class));

            // print books
            books.forEach(System.out::println);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}