package com.pb.timoshenko.hw9;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileNumbers {

    public static void main(String[] args) {

        Path path = Paths.get("numbers.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write("Some test 123");
            writer.newLine();
            writer.write("Other string 456");
        } catch (Exception ex) {
            System.out.println("Error with file write: " + ex);
        }
        System.out.println("Write to file \"" + path.toAbsolutePath() + "\" done!");


    }
//    createNumbersFile
//    create numbers.txt



//    createOddNumbersFile

}
