import java.awt.*;
import java.awt.event.*;

public class SpielFenster extends Frame{
	
	public SpielFenster (String Titel) {
		
		this.setTitle(Titel);
		this.setSize(640,640+38);
				
		this.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e){
				System.exit(0);				
			}
			
		});
	}

}
