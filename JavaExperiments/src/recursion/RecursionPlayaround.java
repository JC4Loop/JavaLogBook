package recursion;

public class RecursionPlayaround {

	public static void main(String[] args) {
		RecursionPlayaround rp = new RecursionPlayaround();
		//long l = rp.doThis(10);
		//System.out.println(l);
		rp.addToString("abc", "zxc");
		rp.add(4,5);
	}

	long doThis(int i) {		
		if( i <= 0 || i > 40) {
			return i;
		} else {
			long l = doThis(i - 1) + doThis(i - 2);
			System.out.println(l);
			return l;
		}
	}
	
	String addToString(String a,String b) {
		char c;
		for (int i = 0, j = a.length(); i < a.length(); i++, j--) {
			c = a.charAt(i);
			b += c;
			System.out.println(b);
		}
		return b;
	}
	
	int add(int num, int n) {
		System.out.println(num);
		if (num == 0) {
			return 0;
		}
		return  n + add(num-1,n);
	}
}
