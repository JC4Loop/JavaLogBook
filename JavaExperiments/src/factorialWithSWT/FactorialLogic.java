package factorialWithSWT;
import java.util.ArrayList;

public class FactorialLogic {
	FactorialGUI view;
	
	public void registerViewWithModel(FactorialGUI view) {
		this.view = view;
	}
	public void prepareComputeEvent() {
		String inputStr = view.getInputText();
		try {
			int nInput = Integer.parseInt(inputStr);
			if (nInput >= 1) {
				computeEvent(nInput);
			} else {
				view.appendMTarea("Error number must be 1 or over\n");
			}
		} catch (NumberFormatException nfe) {
			view.appendMTarea("ERROR! Non numeric or null input entered\n");
		} finally {
			view.clearInputText();
		}
	}
	
	void computeEvent(int nInput) {
		ArrayList<Integer> numbers = Factorial.getFactorialNums(nInput);
		//ArrayList<Integer> numbers = Factorial.getFactorialNumsWoR(nInput);
		int nResult = Factorial.getFactorialResult(nInput);
		//int nResult = Factorial.getFResultWoR(nInput);
		int len = numbers.size();
		int count = 0;
		for (int n : numbers) {
			if (count < (len - 1)) {
				// if there is still one more element after current
				view.appendMTarea(n + " * ");
				count++;
			} else {
				view.appendMTarea(n + " ");
			}
		}
		view.appendMTarea("= " + nResult );
		view.appendMTarea("\n");
	}
}
