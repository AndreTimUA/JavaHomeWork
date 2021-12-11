package com.pb.timoshenko.test_final;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Person{
    private String name;
    private Date dateBirthday;
    private List <Integer> phone;
    private String address;
    private Date dateEdit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateBirthday() {
        return dateBirthday;
    }

    public void setDateBirthday(Date dateBirthday) {
        this.dateBirthday = dateBirthday;
    }

    public List<Integer> getPhone() {
        return phone;
    }

    public void setPhone(List<Integer> phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateEdit() {
        return dateEdit;
    }

    public void setDateEdit(Date dateEdit) {
        this.dateEdit = dateEdit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(dateBirthday, person.dateBirthday) && Objects.equals(phone, person.phone) && Objects.equals(address, person.address) && Objects.equals(dateEdit, person.dateEdit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dateBirthday, phone, address, dateEdit);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dateBirthday=" + dateBirthday +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                ", dateEdit=" + dateEdit +
                '}';
    }
}
