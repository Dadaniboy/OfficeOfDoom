import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class NameAbfrageFrame extends Frame implements MouseListener, KeyListener{
	
	// Frägt den Namen des Spielers ab und übergibt diesen dann an das erzeugte Spielfeld
	
	private static final long serialVersionUID = 12131L;
	String SpielerName = "";
	TextField NamensEingabe = new TextField();
	
	Button okay = new Button("Okay");
			
	
	NameAbfrageFrame () {
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		
		setTitle("Bitte Namen eingeben, Buerokraft!");
		setSize(500,100);
		setLayout(new GridLayout());
		setLocation((dim.width/2)-250,(dim.height/2)-50);
						
		add(NamensEingabe);
		NamensEingabe.setSize(50,50);
		add(okay);
		okay.setSize(80, 50);
		okay.addMouseListener(this);

		NamensEingabe.addKeyListener(this);
					
		addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e){
				((Window) e.getComponent()).dispose();
				
				}
			
		});
		setResizable(false);
		
	}
	
	public void SpielFeldErstellen(){
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		
		SpielerName = NamensEingabe.getText();
		Frame HauptFenster = new SpielFenster("Office of Doom - "+ SpielerName);
		HauptFenster.setLocation((dim.width/2)-32,(dim.height/2)-140);

		HauptFenster.setSize(640, 740);
		HauptFenster.setResizable(false);
		HauptFenster.setVisible(true);	
		this.dispose();
		
	}

	public void mouseClicked(MouseEvent e) {
		
		SpielFeldErstellen();
		
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



	public void keyPressed(KeyEvent e) {
		

        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
        	
        	SpielFeldErstellen();
        }

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


}
