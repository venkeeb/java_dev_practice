package com.sample;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestTerminalOpsStreams {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(3, 5, 7, 9, 11, 13);

		/** 1. Collecting elements into a list */
		List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("Even numbers: " + evenNumbers);

		/** 2. Counting elements */
		long count = numbers.stream().filter(n -> n > 5).count();
		System.out.println("Count of numbers greater than 5: " + count);

		/** 3. Finding the maximum and minimum */
		Optional<Integer> maxNumber = numbers.stream().max(Integer::compareTo);
		maxNumber.ifPresent(max -> System.out.println("Maximum number: " + max));

		Optional<Integer> minNumber = numbers.stream().min(Integer::compareTo);
		minNumber.ifPresent(min -> System.out.println("Minimum number: " + min));

		/** 4. Summing elements */
		int sum = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum of all numbers: " + sum);

		/** 5. Finding an element */
		Optional<Integer> anyNumber = numbers.stream().filter(n -> n > 10).findAny();
		anyNumber.ifPresent(num -> System.out.println("Any number greater than 10: " + num));

		Optional<Integer> firstNumber = numbers.stream().filter(n -> n > 10).findFirst();
		firstNumber.ifPresent(num -> System.out.println("First number greater than 10: " + num));

		/** 6. Reducing elements */
		Optional<Integer> product = numbers.stream().reduce((a, b) -> a * b);
		product.ifPresent(prod -> System.out.println("Product of all numbers: " + prod));
	}
}