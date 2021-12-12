package com.pb.timoshenko.hw12;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class PhonesBook {
    public static void main(String[] args) throws ParseException, IOException {
        System.out.println("|----------Welcome to Phone's Book!----------|");
        ArrayList<Person> persons = new ArrayList<>();
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
// JSON
        ObjectMapper mapper = new ObjectMapper();
//        mapper.enable(SerializationFeature.INDENT_OUTPUT);
// Create test contact
        persons.add(new Person());
        persons.add(new Person());
        persons.add(new Person());

        while (true) {
            System.out.println("----------Enter number function:----------");
            System.out.println("1 - Add new contact\n" +
                    "2 - Remove contact\n" +
                    "3 - Search contact\n" +
                    "4 - View sorting contact\n" +
                    "5 - Edite contact\n" +
                    "6 - Save phone book in file *.json\n" +
                    "7 - Import phone book\n" +
                    "9 - View phone's book\n" +
                    "0 - EXIT!");
            int numComand = sc.nextInt();
// 1 - Create new contact
            if (numComand == 1){
                Person person = new Person();
                person.createContact();
                persons.add(person);
            }
// 2 - Remove contact
            else if (numComand == 2){
                System.out.print("Enter name for removing: ");
                String nameRemove = sc.next();
                persons.removeIf(ps -> Objects.equals(ps.getName(), nameRemove));
                System.out.println("Contact " + nameRemove + " removed!");
            }
// 3 - Search contact
            else if (numComand == 3){
                System.out.print("Enter name for searching: ");
                String nameSearch = sc.next();
                for (Person ps:persons){
                    if (Objects.equals(ps.getName(), nameSearch))
                        System.out.println(ps);
                }
            }
// 4 - Sorting book
            else if (numComand == 4) {
                System.out.println("How sorting contact? \n" +
                        "1 - For name\n" +
                        "2 - For Date Birthday\n");
                numComand = sc.nextInt();
                if (numComand == 1){
                    persons.sort(Comparator.comparing(Person::getName));
                    System.out.println(persons);
                }
                else if (numComand == 2){
                    persons.sort(Comparator.comparing(Person::getDateBirthday));
                    System.out.println(persons);
                }
            }
// 5 - Edite contact
            else if (numComand == 5){
                System.out.print("Enter name for editing: ");
                String nameEdite = sc.next();
                for (Person ps:persons){
                    if (Objects.equals(ps.getName(), nameEdite)){
                        System.out.print("Enter second phone: ");
                        Integer number = sc.nextInt();
                        List<Integer> numTemp = ps.getPhone();
                        numTemp.add(number);
                        ps.setPhone(numTemp);
                        ps.setDateEdit(new Date());
                        System.out.println(numTemp);
                    }
                }
            }
// 6 - Save phone book in file *.json
            else if (numComand == 6){
                System.out.print("Enter path file for save JSON file: ");
                String personsJson = mapper.writeValueAsString(persons);
                File file = Paths.get("./src/com/pb/timoshenko/hw11/persons.json").toFile();
                FileOutputStream outputStream = new FileOutputStream(file);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
                objectOutputStream.writeObject(personsJson);
                objectOutputStream.close();
                System.out.println("JSON file created.");
            }
// 7 - Import phone book
            else if (numComand == 7){
                System.out.println("Enter path file: ");
                //mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                File file = Paths.get("./src/com/pb/timoshenko/hw11/personsImport.json").toFile();
                List<Person> personsImport = Arrays.asList(mapper.readValue(file, Person[].class));
                personsImport.forEach(System.out::println);
                persons.addAll(personsImport);
            }
// 9 - View phone book
            else if (numComand == 9) {
                System.out.println(persons);
            }
// 0 - Exit
            else if (numComand == 0) {
                System.out.println("Exit from \"Phone's book\"");
                break;
            }
        }
    }
}
