package objectOriented;

import java.util.ArrayList;

class vhsA{
	void message() {
		System.out.println("I am A");
	}
	void play() {
		System.out.println("I am being played");
	}
}

class vhsB extends vhsA{
	void message() {
		System.out.println("I am B");
	}
	void play() {
		System.out.println("I am B being played unless C is calling super");
	}
}

class vhsC extends vhsB{
	public int number;
	final int playLimit; // blank final variable
	
	vhsC(){
		playLimit = 10; // can only initialise in contructor
	}
	{number = 241;} // instance initialiser block 
	
	void message() {
		System.out.println("I am C");
	}
	void play() {
		super.play();
	}
}

public class Overriding {
	public static void main(String[] args) {
		ArrayList<vhsA> list = new ArrayList<vhsA>();
		list.add(new vhsA());
		list.add(new vhsB()); // Upcast child class to parent reference var
		list.add(new vhsC());
		list.add(new vhsA());
		list.add(new vhsC());
		for (vhsA l : list) {
			l.message();
			l.play();
		}
		//ArrayList<Object> tlist = new ArrayList<Object>();
		
		vhsC c = new vhsC();
		System.out.println(c.number + " " + c.playLimit);
	}
}
