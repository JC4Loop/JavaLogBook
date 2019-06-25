package factorialWithSWT;
import java.util.ArrayList;

public class Factorial {
	
	//without recursion
	public static ArrayList<Integer> getFactorialNumsWoR(int n){
		ArrayList<Integer> nums = new ArrayList<>();
		for (int i = n; i >= 1; i--) {
			nums.add(i);
		}
		return nums;
	}
	// without recursion
	public static int getFResultWoR(int n) {
		if (n <= 0) {
			return 0;
		}
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * i;
		}
		return result;
	}
	
	public static ArrayList<Integer> getFactorialNums(int n){
		ArrayList<Integer> nums = new ArrayList<>();
		nums = getFNRecursive(nums,n);
		return nums;
	}
	
	private static ArrayList<Integer> getFNRecursive(ArrayList<Integer> nums, int n) {
		if(n <= 0) { 
			return nums;
		}
		if(n == 1) {
			nums.add(n);
			return nums;
		} else {
			nums.add(n);
			nums = getFNRecursive(nums,n - 1);
			return nums;
		}
	}

	public static int getFactorialResult(int n) {
		if (n <= 1) { // if less than 1 still return 1
			return 1;
		} else {
			n = n * getFactorialResult(n-1);
			return n;
		}
	}
}
