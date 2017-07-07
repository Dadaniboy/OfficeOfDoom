import java.awt.Canvas;

import javax.swing.JLabel;

public class SpielFeldArea extends JLabel {

	// Erzeugt ein SpielFeld-Objekt in der Area
	
	private static final long serialVersionUID = 441L;

	public  SpielFeldArea (){
		
	Canvas SpielFeld= new SpielFeld();
	SpielFeld.setSize(640, 640);
	
	this.add(SpielFeld);
	
	
	}

	
}
