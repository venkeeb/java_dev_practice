package com.sample;

import java.util.Optional;

public class TestOptionalUsage {
    public static void main(String[] args) {
    	
        /** Creating Optional objects */
        Optional<String> nonEmptyOptional = Optional.of("Hello, World!");
        Optional<String> emptyOptional = Optional.empty();
        Optional<String> nullableOptional = Optional.ofNullable(null);

        /** Checking if value is present */
        if (nonEmptyOptional.isPresent()) {
            System.out.println("Value is present: " + nonEmptyOptional.get());
        } else {
            System.out.println("Value is absent");
        }

        /** Using ifPresent */
        nonEmptyOptional.ifPresent(value -> System.out.println("Value using ifPresent: " + value));
        emptyOptional.ifPresent(value -> System.out.println("This will not be printed"));

        /** Using orElse */
        String valueOrElse = emptyOptional.orElse("Default Value");
        System.out.println("Value using orElse: " + valueOrElse);

        /** Using orElseGet */
        String valueOrElseGet = nullableOptional.orElseGet(() -> "Default Value from Supplier");
        System.out.println("Value using orElseGet: " + valueOrElseGet);

        /** Using orElseThrow */
        try {
            String valueOrElseThrow = emptyOptional.orElseThrow(() -> new IllegalArgumentException("Value not present"));
            System.out.println("Value using orElseThrow: " + valueOrElseThrow);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        /** Using map */
        Optional<Integer> lengthOptional = nonEmptyOptional.map(String::length);
        lengthOptional.ifPresent(length -> System.out.println("Length of string: " + length));

        /** Using flatMap */
        Optional<Optional<String>> nestedOptional = nonEmptyOptional.map(value -> Optional.of(value + " Nested"));
        Optional<String> flattenedOptional = nestedOptional.flatMap(opt -> opt);
        flattenedOptional.ifPresent(value -> System.out.println("Flattened value: " + value));

        /** Using filter */
        Optional<String> filteredOptional = nonEmptyOptional.filter(value -> value.contains("World"));
        filteredOptional.ifPresent(value -> System.out.println("Filtered value: " + value));
    }
}
