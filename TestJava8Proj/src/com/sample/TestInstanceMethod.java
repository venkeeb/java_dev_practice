package com.sample;

/**
 * Method References (Reference to a Instance Method)
 */
import java.util.function.Supplier;

public class TestInstanceMethod {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // Instance method reference of a particular object
        Supplier<Integer> stringLength = str::length;
        Integer length = stringLength.get();
        System.out.println("Length of the string: " + length);
    }
}