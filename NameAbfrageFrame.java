import java.awt.*;
import java.awt.event.*;

public class NameAbfrageFrame extends Frame {
	
	String SpielerName = "";
	TextField NamensEingabe = new TextField();

	
	Button okay = new Button("Okay"){
		
		public void buttonpressed(){
			
			SpielerName = NamensEingabe.getText();
			
		}
		
	};
		
	NameAbfrageFrame () {
		
		setTitle("Bitte Namen eingeben, Bürokraft!");
		add(NamensEingabe);
		NamensEingabe.setSize(50,50);
		add(okay);
		okay.setSize(80, 50);
		setSize(300,100);
		setLayout(new GridLayout());
				
		addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e){
				((Window) e.getComponent()).dispose();
				
				}
			
		});
		setResizable(false);
		
	}


}
