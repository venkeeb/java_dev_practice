package com.sample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestIntermediateOpsStreams {
    // Intermediate Operations (filter, map, flatMap, sorted, distinct, limit, skip)
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape");

		// 1. Filter: Select words that start with 'b' or 'c'
		List<String> filteredWords = words.stream().filter(word -> word.startsWith("b") || word.startsWith("c"))
				.collect(Collectors.toList());

		System.out.println("Filtered words: " + filteredWords);

		// 2. Map: Convert all words to uppercase
		List<String> uppercasedWords = words.stream().map(String::toUpperCase).collect(Collectors.toList());

		System.out.println("Uppercased words: " + uppercasedWords);

		// 3. FlatMap: Flatten a list of lists into a single list
		List<List<String>> nestedList = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("c", "d", "e"),
				Arrays.asList("f", "g"));

		List<String> flattenedList = nestedList.stream().flatMap(List::stream).collect(Collectors.toList());

		System.out.println("Flattened list: " + flattenedList);

		// 4. Sorted: Sort words in alphabetical order
		List<String> sortedWords = words.stream().sorted().collect(Collectors.toList());

		System.out.println("Sorted words: " + sortedWords);

		// 5. Distinct: Remove duplicate words
		List<String> duplicateWords = Arrays.asList("apple", "banana", "apple", "date", "banana", "fig");

		List<String> distinctWords = duplicateWords.stream().distinct().collect(Collectors.toList());

		System.out.println("Distinct words: " + distinctWords);

		// 6. Limit: Limit the result to the first 3 words
		List<String> limitedWords = words.stream().limit(3).collect(Collectors.toList());

		System.out.println("Limited words: " + limitedWords);

		// 7. Skip: Skip the first 2 words
		List<String> skippedWords = words.stream().skip(2).collect(Collectors.toList());

		System.out.println("Skipped words: " + skippedWords);
	}
}