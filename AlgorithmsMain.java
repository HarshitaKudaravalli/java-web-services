import java.util.Random;
import java.util.Scanner;

public class AlgorithmsMain {

	public static void main(final String[] args) {
		final Algorithm1 ob = new Algorithm1();
		int i, n = 0;
		final Scanner reader = new Scanner(System.in);
		System.out.println("Enter the size of the vector:");

		if (reader.hasNextInt()) { // Input validation

			n = reader.nextInt(); // Checks for Integer

		} else {
			System.out.println("Invalid Input");

			System.exit(0);
		}
		if (n <= 0) { // checks for positive integer
			System.out.println("Invalid Input");
			System.exit(0);
		}
		final int[] a = new int[n + 1];

		final Random generator = new Random(); // Generats Random Numbers
		System.out.println("the random numbers in the array are");
		for (i = 1; i <= n; i++) {
			a[i] = generator.nextInt(201) - 100;
			System.out.println(a[i]); // prints numbers in array
		}
		System.out.println("awaiting result.. takes time... please wait..");

		// Calling BruteForce Method and Calculating the time taken by the
		// method

		final double startTime = System.nanoTime();
		final int val1 = ob.BruteForce(n, a);
		final double endTime = System.nanoTime();
		final double diff = (endTime - startTime) / 1000000;

		// Calling Improved BruteForce Method and Calculating the time taken by
		// the method

		final double startTime1 = System.nanoTime();
		final int val2 = ob.BruteForceImproved(n, a);
		final double endTime1 = System.nanoTime();
		final double diff1 = (endTime1 - startTime1) / 1000000;

		// Calling Divide and Conquer Method and Calculating the time taken by
		// the method
		final double startTime2 = System.nanoTime();
		final int val3 = ob.Max_Subarray(a, 1, n);
		final double endTime2 = System.nanoTime();
		final double diff2 = (endTime2 - startTime2) / 1000000;

		// Calling Dynamic programming algorithm by J Kanade Method and
		// Calculating the time taken by the method
		final double startTime3 = System.nanoTime();
		final int val4 = ob.Dp_Max_Subarray(n, a);
		final double endTime3 = System.nanoTime();
		final double diff3 = (endTime3 - startTime3) / 1000000;

		// printing the time taken by algortithms1
		System.out.println("Total time [ms] taken by Brute Force Algorithm: " + diff);
		System.out.println("Total time [ms] taken by Implemented Brute Force Algorithm: " + diff1);
		System.out.println("Total time [ms] taken by Divide and Conquer Algorithm: " + diff2);
		System.out.println("Total time [ms] taken by dynamically implemented Algorithm by J Kanade: " + diff3);

		// Printing the value of maximum subarray sum
		System.out.println("The Maximum subarry sum by Brute Force Algorithm: " + val1);
		System.out.println("The Maximum subarry sum by Implemented Brute Force Algorithm: " + val2);
		System.out.println("The Maximum subarry sum by Divide and Conquer Algorithm: " + val3);
		System.out.println("The Maximum subarry sum by Divide and Conquer Algorithm: " + val4);
	}

}
