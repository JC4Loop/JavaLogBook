package factorialWithSWT;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class FactorialGUI {
	static Display display;
	static Shell shell;
	static Text mTxtOutput;
	static Text inputTxt;
	static Button btn1;
	FactorialLogic model;
	
	public FactorialGUI(FactorialLogic m) {
		model = m;
		display = new Display();
		shell = new Shell(display);
		shell.setMinimumSize(750,300);
		Color white = display.getSystemColor(SWT.COLOR_WHITE);
		Color black = display.getSystemColor(SWT.COLOR_BLACK);
		Color green = display.getSystemColor(SWT.COLOR_GREEN);
		Font lblFont = new Font(display, "Tahoma", 14,SWT.NONE);
		Font inputFont = new Font(display, "Tahoma", 12,SWT.None);
	//	Image small = new Image(display,"raven.png");
	 //   shell.setImage(small);  
		shell.setBackground(white);
		shell.setText("Permetuations");
		shell.setBounds(50, 50, 800, 350);
		GridLayout gridlayout = new GridLayout();
		gridlayout.numColumns = 3;
		shell.setLayout(gridlayout);
		
		Label lbl1 = new Label(shell, SWT.NONE);
		lbl1.setText("Enter number which Factorial will be calculated");
		lbl1.setLocation(150, 5);
		lbl1.setBackground(black);
		lbl1.setForeground(white);
		lbl1.setFont(lblFont);
		
		inputTxt = new Text(shell, SWT.RIGHT | SWT.BORDER);
		inputTxt.setFont(inputFont);
		inputTxt.setBackground(black);
		inputTxt.setForeground(white);
		
		btn1 = new Button(shell,SWT.PUSH);
		btn1.setText("Calculate Factorial");
		
		mTxtOutput = new Text(shell,SWT.READ_ONLY | SWT.MULTI | SWT.BORDER | SWT.WRAP| SWT.V_SCROLL);
		mTxtOutput.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.FILL_VERTICAL));
		mTxtOutput.setBackground(black);
		mTxtOutput.setForeground(green);
		btn1.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {	
				model.prepareComputeEvent();
			}
		});
		
		mTxtOutput.addListener(SWT.Modify, new Listener() {
			public void handleEvent(Event e) {
				mTxtOutput.setTopIndex(mTxtOutput.getLineCount());
			}
		});
		
		model.registerViewWithModel(this);
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) display.sleep();
		}
		display.dispose();
	}
	
	public void appendMTarea(String s) {
		mTxtOutput.append(s);
	}
	public void clearInputText() {
		inputTxt.setText("");
	}
	public String getInputText() {
		return inputTxt.getText();
	}
}
