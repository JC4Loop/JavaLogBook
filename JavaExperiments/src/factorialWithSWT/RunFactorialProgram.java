package factorialWithSWT;

public class RunFactorialProgram {

	public static void main(String[] args) { 
		FactorialLogic model = new FactorialLogic();
		new FactorialGUI(model);
	}

}
