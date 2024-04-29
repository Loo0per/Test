package mathop;
import java.util.Scanner;

public class MathApp {

	public static void main(String[] args) {
		MathOperation m1 = new MathOperation();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number ");
		int number = scan.nextInt();
		
		System.out.println("Enter the range ");
		int range = scan.nextInt();
		
		m1.drawMultiplicationTable(number, range);
		
		System.out.println("Enter positve integer to calculate factorial value: ");
		int n = scan.nextInt();
		
		if(n<0) {
			System.out.println("Please enter positive no");
		}
		else {
			int factorial = m1.calfactorial(n);
			System.out.println(n + "! = " + factorial);
		}
		System.out.println("HEllo world");
			
	}

}
