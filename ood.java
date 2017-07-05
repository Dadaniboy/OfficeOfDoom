import java.awt.*;
import java.awt.event.*;

public class ood {

	public static void main(String[] args) {

		int xAv, yAv;
		xAv = yAv = 0;
		
		Frame HauptFenster = new SpielFenster("Office of Doom");
		HauptFenster.setLocation(500, 250);
		Canvas SpielFeld= new SpielFeld();
		
		HauptFenster.add(SpielFeld);
		HauptFenster.setVisible(true);
		
		
	}

}
