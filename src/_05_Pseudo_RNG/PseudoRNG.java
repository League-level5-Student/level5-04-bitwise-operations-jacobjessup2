package _05_Pseudo_RNG;

public class PseudoRNG {
	/*
	 * It is impossible for a computer to come up with a series of numbers 
	 * that are truly random. They can, however, use mathematical algorithms
	 * to generate numbers that can seem random. These are called pseudo random 
	 * numbers.
	 * 
	 */
	
	//1. Create a member variable of type long called "seed"
	long seed;
	//2. Make a constructor that initializes the memeber variable
	PseudoRNG(long Seed){
		seed = Seed;
	}
	//3. Complete the steps inside the xorShift method
	
	//4. Complete the steps in the main method
	
	//5. Write your own pseudo random generation method. You can use the xor
	//    shift as a guide. Use the main method to test it.
	
	
	
	// This is called the xor shift. It is a very simple algorithm to generate
	// Pseudo random numbers. 
	long xorShift(){
		//1. Create a local long called seed and set it equal to the member variable 
		//   We will only use the local variable for the rest of the method
		long seed;
		seed = this.seed;
		//2. Shift seed to the left 13 bits and save the result
		long seed1 = seed << 13;
		//3. xor seed by the result of step 1 and save that result
		long seed2 = seed ^ seed1;
		//4. Set seed equal to the result of step 2
		seed = seed2;
		//5. Shift seed to the right 7 bits and save the result
		long seed3 = seed >> 7;
		//6. xor seed by the result of step 4 and save that result
		long seed4 = seed ^ seed3;
		//7. Set seed equal to the result of step 5
		seed = seed4;
		//8. Shift seed to the left 17 bits and save the result
		long seed5 = seed << 17;
		//9. xor seed by the result of step 7 and save that result
		long seed6 = seed ^ seed5;
		//10. Set seed equal to the result of step 8
		seed = seed6;
		//11. change the line below to return seed
		return seed;
		//For fun, see if you can rewrite the method using only 4 lines of code
	}
	
	
	
	public static void main(String[] args) {
		//1. Create a PseudoRNG object with any seed. 
		PseudoRNG e1 = new PseudoRNG(3035431l);
		//2. Print the result of xorShift() 3 times and note the random numbers. 
		System.out.println(e1.xorShift());
		System.out.println(e1.xorShift());
		System.out.println(e1.xorShift());
		//3. Create a second PSeudoRNG object with a different seed and print the result of xorShift 3 times.
		PseudoRNG e2 = new PseudoRNG(14352346l);
		//4. Run the tests a second time and notice that 3 random numbers are the same because the seed generates the same sequence of random numbers.
		System.out.println(e2.xorShift());
		System.out.println(e2.xorShift());
		System.out.println(e2.xorShift());
		//If you would like to set the seed with a number that is hard to predict, you can use System.currentTimeMillis().
		PseudoRNG e3 = new PseudoRNG(System.currentTimeMillis());
		System.out.println(e3.xorShift());
		System.out.println(e3.xorShift());
		System.out.println(e3.xorShift());
	}
}


