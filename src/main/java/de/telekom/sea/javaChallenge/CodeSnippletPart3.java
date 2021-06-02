package de.telekom.sea.javaChallenge;

public class CodeSnippletPart3 {

	// Original loop from quest/checkpoint
	private void loopOrig() {

		System.out.println("Original loop from quest/checkpoint:");

		for (int i = 0; i < 8; i++) {
			System.out.println("Iteration: " + i);
		}
	}

	// Original loop from quest/checkpoint
	private void loopWithWhile() {

		System.out.println();
		System.out.println("Implementation with while:");

		int i = 0;
		while (i<8) {
			System.out.println("Iteration: " + i);
			i++;
		}
	}

	private void loopWithDoWhile() {

		System.out.println();
		System.out.println("Implementation with do-while:");

		int i = 0;
		do {
			System.out.println("Iteration: " + i);
			i++;
		} while (i < 8);
	}

	public void snippletPart3() {
		loopOrig();
		loopWithWhile();
		loopWithDoWhile();

	}
}
