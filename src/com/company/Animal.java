package com.company;

public class Animal {

    public String color;

    // деофлтный конструктор
    public Animal() {}

    // если в классе присутствует хотя бы один конструктор отичный от дефолтного
    // то дефолтный конструктор автоматически добавлятья не будет
    public Animal(String color) {
        this.color = color;

    }
}
