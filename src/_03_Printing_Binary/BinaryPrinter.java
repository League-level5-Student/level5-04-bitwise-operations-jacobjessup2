package _03_Printing_Binary;

public class BinaryPrinter {
	/*
	 * Complete the methods below so they print the passed in parameter in binary.
	 * Do not use the Integer.toBinaryString method!
	 * Use the main method to test your methods.
	 */

	
	public void printByteBinary(byte b) {
		for (int i = 7; i >= 0; i--) {
		// We first want to print the bit in the one's place
		int test;
		// Shift b seven bits to the right
		test = b >>> i;
		// Use the & operator to "mask" the bit in the one's place
		// This can be done by "anding" (&) it with the value of 1
		test = test & 1;
		// Print the result using System.out.print (NOT System.out.println)
		System.out.print(test);
		//Use this method to print the remaining 7 bits of b
		
		}
		System.out.println();
	}
	
	public void printShortBinary(short s) {
		// Create 2 byte variables
		byte one;
		byte two;
		// Use bit shifting and masking (&) to save the first
		// 8 bits of s in one byte, and the second 8 bits of
		// s in the other byte
		one = (byte) (s >> 8);
		
		two = (byte) s;
		// Call printByteBinary twice using the two bytes
		// Make sure they are in the correct order
		printByteBinary(one);
		printByteBinary(two);
	}
	
	public void printIntBinary(int i) {
		// Create 2 short variables
		short one;
		short two;
		// Use bit shifting and masking (&) to save the first
		// 16 bits of i in one short, and the second 16 bits of
		// i in the other short
		one = (short) (i >> 16);
		two = (short) i;
		// Call printShortBinary twice using the two short variables
		// Make sure they are in the correct order
		printShortBinary(one);
		printShortBinary(two);
	}
	
	public void printLongBinary(long l) {
		// Use the same method as before to complete this method
		int one;
		int two;
		
		one = (int) (l >> 32);
		two = (int) l;
		
		printIntBinary(one);
		printIntBinary(two);
	}
	
	public static void main(String[] args) {
		// Test your methods here
		BinaryPrinter e = new BinaryPrinter();
		byte byteTester = 127;
		e.printByteBinary(byteTester);
		short shortTester = 21887;
		e.printShortBinary(shortTester);
		int intTester = 1642543215;
		e.printIntBinary(intTester);
		long longTester = 8234523123241235432l;
		e.printLongBinary(longTester);
	}
}
