package com.company;

public class Main {

    public static void main(String[] args) {

        Animal a1 = new Animal();
        Animal q2 = new Animal("white");
        Cat cat = new Cat();

        // Java в неявном виде наследует класс Object а каждый ползовательский класс

        System.out.println(cat);
        System.out.println(cat.hashCode());

        Cat cat2 = new Cat();
        cat2.color = "red";
        cat2 = cat;
        System.out.println(cat.equals(cat2)); // оператор " == " сравнивает адреса памяти
        System.out.println(cat.equals(cat));

        Cat cat3 = new Cat();
        System.out.println(cat.equals(cat3));
        System.out.println(cat.equals("Tom"));

    }
}
