package org.example;

public class Dev {

    private Laptop laptop;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dev(int age) {
        this.age = age;
        System.out.println("Dev constructor with age param");
    }

    public Dev(){
        System.out.println("Dev constructor");
    }

    public void build() {
        laptop.compile();
        System.out.println("Working on Awesome project!");
    }
}
