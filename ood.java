import java.awt.*;

public class ood {

	public static void main(String[] args) {
		
		String SpielerName = "";
		
		Frame NamensAbfrage = new NameAbfrageFrame();
		NamensAbfrage.setVisible(true);
		
		
						
		Frame HauptFenster = new SpielFenster("Office of Doom - "+ SpielerName);
		HauptFenster.setLocation(500, 250);
		Canvas SpielFeld= new SpielFeld();
		
		HauptFenster.add(SpielFeld);
		HauptFenster.setVisible(true);
		
		
	}

}
