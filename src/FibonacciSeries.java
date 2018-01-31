import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args){
		
		// Initialize variables
		long startTime, endTime, elapsedTimeI, elapsedTimeR;
		Scanner s = new Scanner(System.in);  // Reading from System.in
		
		// Get user input
		System.out.print("Fibonacci Series Calculator"
					 + "\nCalculate series to what value  => ");
		int n = s.nextInt();
		s.close();
		
		// Iteratively Print the Fibonacci Series 
		startTime = System.nanoTime();  				// Start time
		fiboSeriesIte(n, 0, 1);							// Calculate Fibonacci sequence iteratively
		endTime = System.nanoTime();  					// End time 
		
		// Calculate execution time
		elapsedTimeI = endTime - startTime;
		
		// Recursively Print the Fibonacci Series 
		startTime = System.nanoTime();  				// Start time
		fiboSeriesRec(n, 0, 1);							// Calculate Fibonacci sequence recursively
		endTime = System.nanoTime();  					// End time 
		
		// Calculate execution time
		elapsedTimeR = endTime - startTime;
		
		// Print execution Times
		System.out.print("\nTime to Calculate Fibonacci Series to " + n + " places"
					   + "\n--- Iterative Method:  " + elapsedTimeI + " ns"
				       + "\n                       " + elapsedTimeI/1000000.0 + " ms\n");
		System.out.print("\n--- Recursive Method:  " + elapsedTimeR + " ns"
					   + "\n                       " + elapsedTimeR/1000000.0 + " ms\n");
		
	}
	
	
	// Recursively Print Fibonacci Series
	public static void fiboSeriesRec (int n, long first, long second){
		if (n > 1){									// Stop at negative values
			System.out.println(n + ": " + first);			// Print current number
			n--;
			fiboSeriesRec(n, second, first+second);	// Shift up number line and find next Fibonacci number
		}
		else
			System.out.println(n + ": " + first);				// Print nth fibonacci number
	}
	
	// Iteratively Print Fibonacci Series
	public static void fiboSeriesIte (int n, long first, long second){
		if (n > 1)										// Don't accept negative values
			for (int i = 1; i < n; i++){				// Loop n-1 times		
				System.out.println(i + ": " + first);			// Print current number
				// Calculate next Fibonacci number and shift number line
				long current = first + second;			// Current number is sum of previous two
				first = second;							// 1 -> 2
				second = current;						// 2 -> 3
			}
		System.out.println(n + ": " + first);						// Print nth fibonacci number
	}
}