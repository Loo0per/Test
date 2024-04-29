package mathop;

public class MathOperation {
	
	public void drawMultiplicationTable(int number, int range) {
		for(int i=1; i <= range; i++) {
			System.out.println(number+ " x "+ i+" = "+ number*i);
		}
	}
	
	public int calfactorial(int n) {
		int factorial = 1;
		for(int x=1; x <= n; x++) {
			factorial *= x;
		}
		return factorial;
	}
	
}
