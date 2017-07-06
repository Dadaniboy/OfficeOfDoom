import java.awt.Button;
import java.awt.Canvas;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.Window;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class NameAbfrageFrame extends Frame implements MouseListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 12131L;
	String SpielerName = "";
	TextField NamensEingabe = new TextField();
	
	Button okay = new Button("Okay");
			
	
	NameAbfrageFrame () {
		
		setTitle("Bitte Namen eingeben, Buerokraft!");
		this.setLocation(500,250);
		add(NamensEingabe);
		NamensEingabe.setSize(50,50);
		add(okay);
		okay.setSize(80, 50);
		okay.addMouseListener(this);
		
		setSize(600,100);
		setLayout(new GridLayout());
			
		addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e){
				((Window) e.getComponent()).dispose();
				
				}
			
		});
		setResizable(false);
		
	}
	

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		SpielerName = NamensEingabe.getText();
		Frame HauptFenster = new SpielFenster("Office of Doom - "+ SpielerName);
		HauptFenster.setLocation(500,250);

		HauptFenster.setSize(640, 740);

		HauptFenster.setResizable(false);
		HauptFenster.setVisible(true);	
		this.dispose();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


}
