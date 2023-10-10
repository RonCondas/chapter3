import java.util.Scanner;

public class grades {

	public static void main(String[] args) {
	
		//1.Variables
		
		Scanner kb = new Scanner(System.in);
		
		int grade = 0;
		
		int total = 0;
		
		double average = 0.0;
		
		int counter = 0;
		
		while(counter < 10) {
		
		//2. Talk to user ask for grades
		
		System.out.println("Enter grades");
		
		
		//3. Store the grade
		
		grade = kb.nextInt();
		
		
		
		
		
		//4. Calculation
		
		total += grade;
		counter ++;
		
		}
		
		average = total /10;
		//5. Display
		System.out.println("Total:" + total);
		
		kb.close();
		
	}

}
