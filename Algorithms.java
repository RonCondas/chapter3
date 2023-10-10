import java.util.Scanner;
public class Algorithms {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int num1 = 0 ;
		
		int num2 =0;
		
		int sum = 0; 
		System.out.println("Please enter first number: ");
		
		
		num1 = kb.nextInt();
		
		System.out.println("Please enter second number: ");
		
		
		num2 = kb.nextInt();
		
		System.out.println("First number: " + num1);
		
		System.out.println("Second number: " + num2);
		
		sum = num1 + num2;
		
	
		System.out.println("The sum is : " + sum);
		
		kb.close();
		
		for (int j = 10; j >= 1; j--) {System.out.println(j);}
		
	}
	
}
