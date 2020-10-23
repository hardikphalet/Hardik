import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class MainWIndow {

	protected Shell shell;
	private Text text;
	private Button button;
	private Button button_1;
	private Button button_2;
	private Button btnNewButton_1;
	private Button button_3;
	private Button button_4;
	private Button button_5;
	private Button button_6;
	private Button button_7;
	private Button btnNewButton_2;
	private Button btnNewButton_3;
	private Button btnNewButton_4;
	private Button btnNewButton_5;
	private Button btnNewButton_6;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainWIndow window = new MainWIndow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setMinimumSize(new Point(200, 180));
		shell.setImage(SWTResourceManager.getImage("C:\\Users\\Avadhesh Sharma\\Desktop\\Java.test\\I\\Movies\\MovieBook\\src\\story-3.png"));
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		Canvas canvas = new Canvas(shell, SWT.NONE);
		canvas.setBackground(SWTResourceManager.getColor(255, 218, 185));
		canvas.setBounds(0, 0, 434, 261);
		
		text = new Text(canvas, SWT.BORDER);
		text.setEditable(false);
		text.setBounds(10, 10, 414, 38);
		
		Button btnNewButton = new Button(canvas, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton.setBounds(36, 54, 80, 25);
		btnNewButton.setText("1");
		
		button = new Button(canvas, SWT.NONE);
		button.setBounds(122, 54, 75, 25);
		button.setText("2");
		
		button_1 = new Button(canvas, SWT.NONE);
		button_1.setBounds(203, 54, 75, 25);
		button_1.setText("3");
		
		button_2 = new Button(canvas, SWT.NONE);
		button_2.setBounds(36, 83, 80, 25);
		button_2.setText("4");
		
		btnNewButton_1 = new Button(canvas, SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton_1.setBounds(122, 83, 75, 25);
		btnNewButton_1.setText("5");
		
		button_3 = new Button(canvas, SWT.NONE);
		button_3.setBounds(203, 83, 75, 25);
		button_3.setText("6");
		
		button_4 = new Button(canvas, SWT.NONE);
		button_4.setBounds(36, 114, 80, 25);
		button_4.setText("7");
		
		button_5 = new Button(canvas, SWT.NONE);
		button_5.setBounds(122, 114, 75, 25);
		button_5.setText("8");
		
		button_6 = new Button(canvas, SWT.NONE);
		button_6.setBounds(203, 114, 75, 25);
		button_6.setText("9");
		
		button_7 = new Button(canvas, SWT.NONE);
		button_7.setBounds(122, 145, 75, 25);
		button_7.setText("0");
		
		btnNewButton_2 = new Button(canvas, SWT.NONE);
		btnNewButton_2.setBounds(349, 54, 75, 54);
		btnNewButton_2.setText("-");
		
		btnNewButton_3 = new Button(canvas, SWT.NONE);
		btnNewButton_3.setBounds(349, 176, 75, 56);
		btnNewButton_3.setText("=");
		
		btnNewButton_4 = new Button(canvas, SWT.NONE);
		btnNewButton_4.setText("+");
		btnNewButton_4.setBounds(349, 114, 75, 56);
		
		btnNewButton_5 = new Button(canvas, SWT.NONE);
		btnNewButton_5.setText("C");
		btnNewButton_5.setBounds(36, 176, 75, 56);
		
		btnNewButton_6 = new Button(canvas, SWT.NONE);
		btnNewButton_6.setText("Backspace");
		btnNewButton_6.setBounds(203, 176, 75, 56);

	}
}
