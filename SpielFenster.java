
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SpielFenster extends Frame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 12231L;

	public SpielFenster (String Titel) {
		
		setTitle(Titel);	
		//setSize(640,640+38);
		
		this.setLayout(null);
		SpielFeldArea SpielFA= new SpielFeldArea();
		SpielFA.setBounds(0,32,640,640);
		this.add(SpielFA);
		SpielFA.requestFocus(true);
		
		ButtonLeiste Buttons = new ButtonLeiste();
		this.add(Buttons);
		Buttons.setBounds(0,672,640,64);
		Buttons.setLocation(0, 672);
		
	
		
		
		

		addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e){
				System.exit(0);	
			
			}
			
		});
	}

}
