package de.telekom.sea.javaChallenge;

public class CodeSnippletPart1 {

	public void snippletPart1() {

// wrong code from quest/challenge:
		
		// for (final int i = 0; i < 8; i++) {
		// System.out.println("Geht nicht");

		// The snipplet will not work as "i" is declared as "final".
		// It is not possible to change the value of the variable after
		// initialization if it is declared with final. As of this the planned
		// loop will not work as the increment of "i" cannot be stored to it during
		// processing.

// Corrected code:
		
		for (int i = 0; i < 8; i++) {
			System.out.println("final was the fault in declaration of variable i");

		}
	}
}
