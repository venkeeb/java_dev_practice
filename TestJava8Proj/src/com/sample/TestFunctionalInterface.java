package com.sample;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Functional Interfaces>>>>");
        Predicate<Integer> isEven = (n) -> n%2 == 0;
        
        /** 1 Predicate Flag True or False check - isEven */
        System.out.println("Predicate Condition Flag True: "+isEven.test(4)); // true
        System.out.println("Predicate Condition Flag False:"+isEven.test(3)); // false
        
        
        /** 2 Function - length check */
        Function<String, Integer> lengthFunction = (s) -> s.length();

        System.out.println(lengthFunction.apply("Hello Ram")); // 5
        System.out.println(lengthFunction.apply("Java 8 Feature")); // 6
        
        /** 3 Supplier - verify Random value */
        Supplier<Double> randomValue = () -> Math.random();

        System.out.println(randomValue.get()); // Random value
        System.out.println(randomValue.get()); // Random value
        
        
        /** 4 Consumer - verify usage */
        Consumer<String> printConsumer = (s) -> System.out.println(s);

        printConsumer.accept("Hello Ram");
        printConsumer.accept("Java 8 Feature");
	}

}
