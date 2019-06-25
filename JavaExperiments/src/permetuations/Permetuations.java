package permetuations;

import java.util.ArrayList;

public class Permetuations {

	public static String swapLastTwoChars(String s) {
		int slength = s.length();
		
		String reserveS;
		if (slength > 2) {
			reserveS = s.substring(0,slength - 2);
			System.out.println(reserveS);
		} else {
			reserveS = "";
		}
		
		char c1 = s.charAt(slength - 2);
		char c2 = s.charAt(slength - 1);
		char temp = c1;
		c1 = c2;
		c2 = temp;
		System.out.println(c1);
		System.out.println(c2);
		return reserveS + c1 + c2;
	}
	
	public static void OutputAllPermetuations(String s) {
		char c1, c2;
		int slength = s.length();
		
	}
	
	public static void Execute(String s,int x, int y) {
		char c1 = s.charAt(x);
		char c2 = s.charAt(y);
		char temp = c1;
		c1 = c2;
		c2 = temp;
	}
	
	public static ArrayList<String> getPerms(String str){
		if (str == null) {
			return null;
		}
		
		ArrayList<String> permetuations = new ArrayList<String>();
		if (str.length() == 0) {
			permetuations.add("");
			return permetuations;
		}
		
		char first = str.charAt(0);// get first char
		String remainder = str.substring(1);
		ArrayList<String> words = getPerms(remainder);
		for (String word : words) {
			for (int j = 0; j <= word.length(); j++) {
				String s = insertCharAt(word,first,j);
				permetuations.add(s);
			}
		}
		return permetuations;
	}
	
	public static String insertCharAt(String word, char c, int i) {
		String start = word.substring(0, i);
		String end = word.substring(i);
		return start + c + end;
	}

	
}
