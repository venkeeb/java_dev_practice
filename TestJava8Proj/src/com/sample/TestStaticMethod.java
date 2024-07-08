package com.sample;

/**
 * Method References (Reference to a Static Method)
 */
import java.util.function.Function;

public class TestStaticMethod {
    public static void main(String[] args) {
        // Static method reference
        Function<String, Integer> stringToInteger = Integer::parseInt;
        Integer result = stringToInteger.apply("123");
        System.out.println("Result of static method reference: " + result);
    }
}

