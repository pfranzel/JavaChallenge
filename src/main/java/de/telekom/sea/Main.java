package de.telekom.sea;

import de.telekom.sea.javaChallenge.part1.CodeSnippletPart1;
import de.telekom.sea.javaChallenge.part2.CodeSnippletPart2;
import de.telekom.sea.javaChallenge.part3.CodeSnippletPart3;
import de.telekom.sea.javaChallenge.part4.CodeSnippletPart4;
import de.telekom.sea.javaChallenge.part5.PersonenApp;
import de.telekom.sea.javaChallenge.queue5g.*;

public class Main {

	public static void main(String[] args) {

		// Start Part 1 Solution
		System.out.println("Part1 solution:");
		CodeSnippletPart1 csp1 = new CodeSnippletPart1();
		csp1.snippletPart1();

		// Start Part 2 Solution
		System.out.println();
		System.out.println("Part2 solution:");
		CodeSnippletPart2 csp2 = new CodeSnippletPart2();
		csp2.snippletPart2();

		// Start Part 3 Solution
		System.out.println();
		System.out.println("Part3 solution:");
		CodeSnippletPart3 csp3 = new CodeSnippletPart3();
		csp3.snippletPart3();

		// Start Part 4 Solution
		System.out.println();
		System.out.println("Part4 solution:");
		CodeSnippletPart4 csp4 = new CodeSnippletPart4();
		csp4.snippletPart4();

		// Start Part 5 Solution
		System.out.println();
		System.out.println("Part5 solution:");

        PersonenApp persApp = PersonenApp.getRootApp();
        persApp.run(args);
		
		// Start Part 7 - Generic Solution
		System.out.println();
		System.out.println("Part6 solution:");

		GenericApp t = GenericApp.getRootApp();
		t.run(args);
		
	}
}
