package objectOriented;

interface Drawables {
	void draw();
	static int cube(int x) {return x * x * x;}
}

class Rectanglez implements Drawables {
	public void draw () {System.out.println("drawing rectangle");}
}

public class StaticMethodInter {

	public static void main(String[] args) {
		Drawables d = new Rectanglez();
		d.draw();
		System.out.println(Drawables.cube(3));
	}
}
