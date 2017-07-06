import java.awt.*;

public class ood {

	public static void main(String[] args) {
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		
		Frame SpielFenster = new SpielFenster("Office of Doom");
		SpielFenster.setLocation((dim.width/2)-320,(dim.height/2)-339);
		
		Canvas SpielFeld = new SpielFeld();
		SpielFenster.add(SpielFeld);
		SpielFenster.setVisible(true);

		
	}

}
