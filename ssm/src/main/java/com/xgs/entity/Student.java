package com.xgs.entity;

public class Student {
    Integer Id;
    String Name;
    Integer Age;
    Integer Phone;
    String Address;
    String ClassName;

    public Student(Integer id, String name, Integer age, Integer phone, String address, String className) {
        Id = id;
        Name = name;
        Age = age;
        Phone = phone;
        Address = address;
        ClassName = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Phone=" + Phone +
                ", Address='" + Address + '\'' +
                ", ClassName='" + ClassName + '\'' +
                '}';
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public Integer getPhone() {
        return Phone;
    }

    public void setPhone(Integer phone) {
        Phone = phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }
}
