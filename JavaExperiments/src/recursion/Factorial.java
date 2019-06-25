package recursion;

public class Factorial {

	public static void main(String[] args) {
		getFactorial(3);
	}

	public static long factorial(int n) {
		if (n == 1) {
			System.out.print(n + " = ");
			return 1;
		} else {
			System.out.print(n + " * ");
			return n * factorial(n - 1);
		}
	}
	
	public static void getFactorial(int n) {
		long l = factorial(n);
		System.out.println(" " + l);
	}
}
