package permetuations;

import java.util.ArrayList;

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

public class runPermetuations {

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		
		Color white = display.getSystemColor(SWT.COLOR_WHITE);
		Color black = display.getSystemColor(SWT.COLOR_BLACK);
		Color green = display.getSystemColor(SWT.COLOR_GREEN);
		Font lblFont = new Font(display, "Tahoma", 14,SWT.NONE);
		Font inputFont = new Font(display, "Tahoma", 12,SWT.None);
		
		
		shell.setBackground(white);
		shell.setText("Permetuations");
		shell.setBounds(50, 50, 800, 350);
		GridLayout gridlayout = new GridLayout();
		gridlayout.numColumns = 3;
		shell.setLayout(gridlayout);
		
		
		Label lbl1 = new Label(shell, SWT.NONE);
		lbl1.setText("Enter Word with unique characters");
		lbl1.setLocation(150, 5);
		lbl1.setBackground(black);
		lbl1.setForeground(white);
		lbl1.setFont(lblFont);
	
		
		Text txt = new Text(shell, SWT.RIGHT | SWT.BORDER);
		txt.setFont(inputFont);
		txt.setBackground(black);
		txt.setForeground(white);
		
		Button btn = new Button(shell,SWT.PUSH);
		btn.setText("list permetuations");
		
		
		
		Text mtxtline = new Text(shell,SWT.READ_ONLY | SWT.MULTI | SWT.BORDER | SWT.WRAP| SWT.V_SCROLL);

		mtxtline.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.FILL_VERTICAL));
		mtxtline.setBackground(black);
		mtxtline.setForeground(green);
		
		btn.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				String s = Permetuations.swapLastTwoChars(txt.getText());
				ArrayList<String> perms = Permetuations.getPerms(txt.getText());
				for (String str : perms) {
					mtxtline.append(str + " ");
				}
			
			}
		});
		
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) display.sleep();
		}
		display.dispose();
		
	}

}
