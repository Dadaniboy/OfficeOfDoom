import java.awt.*;
import java.awt.event.*;

public class SpielFenster extends Frame{
	
	public SpielFenster (String Titel) {
		
		setTitle(Titel);
		setSize(640,678);
		setResizable(false);
		
		addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e){
				System.exit(0);				
			}
			
		});
	}

}
