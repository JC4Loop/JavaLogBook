package BinaryInJava;

public class AddSubAndOr {

	public static void main(String[] args) {
		int x = 0b0011;
		int y = 0b1011;
		int z = x + y;	//ADD
	//	System.out.println(Integer.toBinaryString(x));
	//	System.out.println("+");
	//	System.out.println(Integer.toBinaryString(y));
	//	System.out.println(Integer.toBinaryString(z) + " (" +z + ")");
	//	System.out.println("");
		output(x,y,z);
		z = x & y;		// AND
		output(x,y,z);
		z = x | y;		// OR
		output(x,y,z);
		z = x ^ y; 		// XOR
		output(x,y,z);
		//x = x << 1;
		System.out.println("var x Shift Left once");
		System.out.println(Integer.toBinaryString(x << 1));
		System.out.println("var x shift left three times From 00" + Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(x << 3));
		System.out.println();
		System.out.println("" + addWithoutPlus(32,4));
		subUsing2sComp(29,12);
		
	}
	
	public static int addWithoutPlus(int x, int y) {
		if (y == 0) {
			return x;
		} else {
			int and = x & y;	// AND -- turns two 1s to 0
			x = x ^ y;			// XOR = gives result of adding without shifting
			y = and << 1;		// left shift the AND result once
			return addWithoutPlus(x,y);
		}
	}
	
	public static int subUsing2sComp(int x, int y) {
		if (x < 0 || y < 0) {
			throw new IllegalArgumentException("Only positive integers allowed");
		}
		if (y > x) {
			throw new IllegalArgumentException(
					"Subtracting a larger number from smaller number is not allowed."
					+ " subUsing2sComp(value to subtract from, number to subtract)");
		}
		//System.out.println("Begin 2s Complement");
		int xLength = Integer.toBinaryString(x).length();
		//System.out.println(xLength);
		int yLength = Integer.toBinaryString(y).length();
		//System.out.println(yLength);
		int maxLength = xLength;
		if (yLength > maxLength) {
			maxLength = yLength;
		}
		
		// get max value so we can trim unwanted 1s carried over
		int binaryRep = 1;
		int compare = 1;
		for (int i = 1; i < maxLength; i++) {
			binaryRep = 2 * binaryRep;
			compare += binaryRep;
		}

		int invertY = ~y & compare; // compare takes away unwanted 0s on left
		int iYp1 = addWithoutPlus(invertY,1); // get inverted y + 1
		// x add y before omitting unwanted bits to left
		int xAddyB4 = addWithoutPlus(x,iYp1);
		int result = xAddyB4 & compare;
		//System.out.println(Integer.toBinaryString(invertY));
		//System.out.println(Integer.toBinaryString(iYp1) + "");
		//System.out.println(result);
		//System.out.println("End 2s Complement - returning value");
		return result;
	}
	
	public static void output(int x, int y, int z) {
		System.out.println();
		String xStr = Integer.toBinaryString(x);
		String yStr = Integer.toBinaryString(y);
		String zStr = Integer.toBinaryString(z);
		int xlen = xStr.length();
		int ylen = yStr.length();
		int zlen = zStr.length();
		int maxlen = xlen;
		if (ylen > maxlen) {
			maxlen = ylen;
		} else if (zlen > maxlen){
			maxlen = zlen;
		}

		xStr = changeString(maxlen,xlen,xStr);
		yStr = changeString(maxlen,ylen,yStr);
		zStr = changeString(maxlen,zlen,zStr);
		System.out.println(xStr);
		System.out.println(yStr);
		for (int i = 0; i < maxlen; i++) {
			System.out.print("_");
		}
		System.out.println();
		System.out.println(zStr);
	}
	
	public static String changeString(int maxlen,int varlen,String varStr) {
		int difference = maxlen - varlen;
		String s = "";
		for (int i = 0; i < difference; i++) {
			s += "0";
		}
		return s + varStr;
	}

}
