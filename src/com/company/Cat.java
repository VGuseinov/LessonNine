package com.company;

public class Cat extends Animal {

    public Cat() {
        super("red");
    }

    public Cat(String color) {
        super(color);
    }

    @Override
    public String toString() {
        return "Cat: " + this.color;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        // совпадение ссылок
        if (this == obj) {
            return true;
        }

        // проверка на совпадение хэш-кодов
        if (this.hashCode() == obj.hashCode()) {
            return true;
        }

        // преобразуем объект типа Object к объекту типа Cat

        // instanceof
        if (obj instanceof Cat) {
            Cat compCat = (Cat)obj;
            return compCat.color.equals(this.color);
        }
        return false;
    }

}
