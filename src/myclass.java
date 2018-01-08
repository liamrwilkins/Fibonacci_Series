import java.util.Scanner;

public class myclass {
	public static void main(String[] args){
		int i;
		String st;
		
		// User input
		Scanner s = new Scanner(System.in);
		System.out.print("Give a string: ");
		st = s.nextLine();
		
		System.out.println("\nString is " + st);
		
		// Loop
		for (i = 0; i < st.length(); i++){
			System.out.print("'" + st.charAt(i) + "'");
			if(i < st.length() - 1)
				System.out.print(" + ");
		}
		
		// Conditional
		if(i>5)
			System.out.println("\nString is big (" + i + ")");
		else if(i == 0)
			System.out.println("\nString is null");
		else 
			System.out.println("\nString is small (" + i + ")");
	}
}