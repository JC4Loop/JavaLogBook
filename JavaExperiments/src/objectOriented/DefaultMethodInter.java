package objectOriented;

interface Drawable{
	void draw();
	default void msg() {
		System.out.println("default method in Drawable");
	}
}

class Rectangle implements Drawable {
	public void draw() {
		System.out.println("drawing rectangle");
	}
}
public class DefaultMethodInter {

	public static void main(String[] args) {
		Drawable d = new Rectangle();
		d.draw();
		d.msg();
	}
}
