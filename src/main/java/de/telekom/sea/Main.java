package de.telekom.sea;

import de.telekom.sea.javaChallenge.part1.CodeSnippletPart1;
import de.telekom.sea.javaChallenge.part2.CodeSnippletPart2;
import de.telekom.sea.javaChallenge.part3.CodeSnippletPart3;
import de.telekom.sea.javaChallenge.part4.CodeSnippletPart4;

public class Main {

	public static void main(String[] args) {

		System.out.println("Part1 solution:");
		CodeSnippletPart1 csp1 = new CodeSnippletPart1();
		csp1.snippletPart1();
		
		System.out.println();
		System.out.println("Part2 solution:");
		CodeSnippletPart2 csp2 = new CodeSnippletPart2();
		csp2.snippletPart2();
		
		System.out.println();
		System.out.println("Part3 solution:");
		CodeSnippletPart3 csp3 = new CodeSnippletPart3();
		csp3.snippletPart3();
		
		System.out.println();
		System.out.println("Part4 solution:");
		CodeSnippletPart4 csp4 = new CodeSnippletPart4();
		csp4.snippletPart4();
	}

}
