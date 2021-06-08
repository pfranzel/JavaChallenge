package de.telekom.sea.javaChallenge.part4;

import java.util.HashMap;
import java.util.Map;

public class CodeSnippletPart4 {

	int[] instanceCounts;

	String poem = String.join("", "Whose woods these are I think I know.", "His house is in the village, though;",
			"He will not see me stopping here", "To watch his woods fill up with snow.", "",
			"My little horse must think it's queer", "To stop without a farmhouse near",
			"Between the woods and frozen lake", "The darkest evening of the year.", "",
			"He gives his harness bells a shake", "To ask if there's some mistake.", "The only other sound's the sweep",
			"Of easy wind and downy flake.", "", "The woods are lovely, dark, and deep,",
			"But I have promises to keep,", "And miles to go before I sleep,", "And miles to go before I sleep.");

	public void snippletPart4() {
		Map<String, Long> map = new HashMap<>();
		map = countCharacters(poem.toLowerCase());
		map.forEach((k, v) -> System.out.printf("%s: %s%n", k, v));
	}

	private Map<String, Long> countCharacters(String s) {
		String[] alphachars = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
				"r", "s", "t", "u", "v", "w", "x", "y", "z" };
		Map<String, Long> map = new HashMap<>();
		for (String ch : alphachars) {
			map.put(ch, countOccurrencesOfChar(s, ch.charAt(0)));
		}
		return map;
	}

	private static long countOccurrencesOfChar(final String s, final char character) {
		return s.codePoints().filter(ch -> ch == character).count();
	}

	/*
	 * private String sortString(String s) { char[] charArray =
	 * s.toLowerCase().toCharArray(); Arrays.sort(charArray); String sortedString =
	 * new String(charArray); System.out.println(sortedString); return sortedString;
	 * }
	 */

	/*
	 * private String countCharacters(String s) {
	 * 
	 * HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
	 * 
	 * // checking each char of strArray for (char ch : s.toCharArray()) { if
	 * (charCountMap.containsKey(ch)) {
	 * 
	 * // If char is present in charCountMap, // incrementing it's count by 1
	 * charCountMap.put(ch, charCountMap.get(ch) + 1); } else {
	 * 
	 * // If char is not present in charCountMap, // putting this char to
	 * charCountMap with 1 as it's value charCountMap.put(ch, 1); } } for (Map.Entry
	 * entry : charCountMap.entrySet()) { System.out.println(entry.getKey() + " " +
	 * entry.getValue()); } return null; }
	 */

	/*
	 * private Map<String, Long> countCharacters(String poem) { Map<String, Long>
	 * result = Arrays.stream(poem.split("")).map(String::toLowerCase)
	 * .collect(Collectors.groupingBy(s -> s, LinkedHashMap::new,
	 * Collectors.counting()));
	 * System.out.println("Result with non alphabethic characters: " + result);
	 * return result; }
	 */
}