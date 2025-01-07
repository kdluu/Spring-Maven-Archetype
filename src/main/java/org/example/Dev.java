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

    public Dev(){
        System.out.println("Dev constructor");
    }

    public Dev(Laptop laptop) {
        this.laptop = laptop;
        System.out.println("Dev1 constructor");
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }


    public void build() {
        System.out.println("Working on Awesome project!");
        laptop.compile();
    }
}
