package com.sample;

/**
 * Method References (Constructors)
 */

import java.util.function.Supplier;

class Person {
    private String name;
    
    public Person() {
        this.name = "Default Name";
    }
    
    public Person(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }
}

public class TestReferenceConstructor {
    public static void main(String[] args) {
        // Constructor reference
        Supplier<Person> personSupplier = Person::new;
        Person person = personSupplier.get();
        System.out.println("Person created using constructor reference: " + person);
    }
}
