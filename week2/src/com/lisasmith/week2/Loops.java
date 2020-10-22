package com.lisasmith.week2;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Requirement 1
		// Evaluate and print out the following Boolean Expressions: 
		System.out.println("Week 2 Coding Assignment");
		System.out.println("Requirement #1");
		System.out.println("Boolean Expressions & their results:");
		System.out.println("------------------------------------");
		System.out.println("true && false: " + (true && false));
		System.out.println("true || false: " + (true || false));
		System.out.println("false && false: " + (false && false));
		System.out.println("true && (false || true): "
					+ (true && (false || true)));
		System.out.println("false || (true && false)): " 
						+ (false || (true && false)));
		System.out.println("false || 1<5: " + (false || 1<5));	
		System.out.println("5>=4 && 1>3: " + (5>=4 && 1>3));
		System.out.println("10<4 && 1>4: " + (10<4 || 1>4));
		System.out.println("12>=2 && 1<24: " + (12>=2 && 1<24));
		System.out.println("\"Hello\".charAt(0) == 'h': "
				+  ("Hello".charAt(0) == 'h'));
		System.out.println();
		System.out.println();
	
		// Requirement 2
		// Boolean variables assigned values
		boolean isHotOutside = true;
		boolean isWeekDay = false;
		boolean hasMoneyInPocket = true;

		// Printing out the Requirement 2 variables
		// using if-else statements 
		// and appropriate answers based on values
		System.out.println("Requirement #2");
		System.out.println("Boolean Variables & \"Yes\" or \"No\" based on their values:");
		System.out.println("--------------------------------------------------------");
		System.out.print("Is it Hot Outside?  ");
		if (isHotOutside) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		System.out.print("Is today a week day?  ");
		if (isWeekDay) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		System.out.print("Do I have money in my pocket?  ");
		if (hasMoneyInPocket) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println();
		System.out.println();
		
	
		// Requirement 3
		// Variables with appropriate data types and values
		double costOfMilk = 2.99;
		double moneyInWallet = 40.00;
		byte thirstLevel = 2; // Restricted to a scale from 1-10

		
		// Printing out the Requirement 3 variables
		// showing chosen values for each variable
		System.out.println("Requirement #3");
		System.out.println("Declared variables & their assigned values:");
		System.out.println("-------------------------------------------");
		System.out.println("The cost of milk is $" + String.format("%.2f", costOfMilk) + ".");
		System.out.println ("I have $" + String.format("%.2f", moneyInWallet) + " in my wallet.");
		System.out.println ("On a scale from 1 to 10, my level of thirst" 
				+ " is at a "+ thirstLevel + ".");
		System.out.println();
		System.out.println();

		// Requirement 4
		// Use variables and boolean operators to create new variables
		boolean shouldBuyIcecream = isHotOutside && hasMoneyInPocket;
		boolean willGoSwimming = isHotOutside && !isWeekDay;
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekDay;
		boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && (moneyInWallet >= (2 * costOfMilk));

		// Based on new boolean variables, print the answer to each of the following
		// questions:
		// Print either "Yes" or "No" depending on the value of the new booleans.
		System.out.println("Requirement #4");
		System.out.println("New Boolean Variables & \"Yes\" or \"No\" based on the boolean statements:");
		System.out.println("-------------------------------------------------------------------------");
		System.out.print("Should we buy Ice Cream?  ");
		if (shouldBuyIcecream) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println();

		System.out.print("Will we go swimming?  ");
		if (willGoSwimming) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println();

		System.out.print("Is today a good day?  ");
		if (isAGoodDay) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println();

		System.out.print("Will we buy milk?  ");
		if (willBuyMilk) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println();
		System.out.println();

		// Requirement 5.
		// Using loops to print out a variety of different requirements

		System.out.println("Requirement #5");
		System.out.println("--------------");

		// Requirement 5a.
		// Create a while loop that prints all even numbers from 0 to 100.

		System.out.println("Requirement #5a");
		System.out.println("Print all EVEN numbers from 0 to 100:");
		System.out.println("-------------------------------------");

		int counter = 0;
		while (counter <= 100) {
			if (counter % 2 == 0) {
				System.out.print(counter + " ");
			}
			counter++;
		}
		System.out.println();
		System.out.println();

		// Requirement 5b.
		// Create a while loop that prints every third number going backwards from 100
		// until we reach 0.

		System.out.println("Requirement #5b");
		System.out.println("Print every third number going backwards from 100 until we reach 0:");
		System.out.println("-------------------------------------------------------------------");

		int backwardscounter = 100;
		while (backwardscounter >= 0) {
			System.out.print(backwardscounter + " ");
			backwardscounter = backwardscounter - 3;
		}
		System.out.println();
		System.out.println();

		// Requirement 5c.
		// Create a for loop that prints every other number from 1 to 100.

		System.out.println("Requirement #5c");
		System.out.println("Print every other number from 1 to 100:");
		System.out.println("---------------------------------------");
		
		for (int i = 1; i <= 100; i = i + 2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println();

		// Requirement 5d.
		// Create a for loop that prints every numbers from 0 to 100, with the following
		// exceptions:
		// 			If the number is divisible by 3, print "Hello" instead of the number,
		// 			and if the number is divisible by 5, print "World" instead of the number,
		// 			and if the number is divisible by both 3 and 5, print "Hello World" instead
		// 			of the number.

		System.out.println("Requirement #5d");
		System.out.println("Print every other number from 0 to 100 with the following rules:");
		System.out.println("  If the number is divisible by 3 and 5, print 'HelloWorld'.");
		System.out.println("  If the number is divisible by 3, print 'Hello'.");
		System.out.println("  If the number is divisible by 5, print 'World'.");
		System.out.println("  Otherwise, print the number.");
		System.out.println("----------------------------------------------------------------");
		System.out.println();

		for (int c = 0; c <= 100; c++) {
			if ((c % 3 == 0) && (c % 5 == 0) && (c != 0)) {
				System.out.print("HelloWorld ");
				System.out.println();
			} else if ((c % 3 == 0) && (c != 0)) {
				System.out.print("Hello ");
			} else if ((c % 5 == 0) && (c != 0)) {
				System.out.print("World ");

			} else {
				System.out.print(c + " ");
			}
		}

	}

}
