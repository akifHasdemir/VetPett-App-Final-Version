package com.example.vetpetapp;

public class Pet {
    private String name;
    private String type;
    private int age;
    private String sex;

    private static int counter = 0;

    private int petId;

    public Pet() {
        this.petId = counter++;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getId() {
        return petId;
    }

    public void setId(int id) {
        this.petId = id;
    }
}
