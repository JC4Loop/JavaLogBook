package recursion;
public class RecursionExamples {
	static int count = 0;
	static void p(int max) {
		count++;
		if (count <=max) {
			System.out.println("Hello " + count);
			p(max);
		}
	}
	public static void main(String[] args) {
		p(10);
	}

}
