import java.awt.*;
import java.awt.event.*;

public class NameAbfrageFrame extends Frame {
	
	String SpielerName = "";
	
	Button okay = new Button("Okay"){
		
		public void buttonpressed(){
			
			SpielerName = NamensEingabe.getText();
			
		}
		
	};
	TextField NamensEingabe = new TextField();
	
	NameAbfrageFrame () {
		
		setTitle("Bitte Namen eingeben, Bürokraft!");
		add(okay);
		add(NamensEingabe);
		setSize(300,100);
				
		addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e){
				((Window) e.getComponent()).dispose();
				
				}
			
		});
		
		setResizable(false);
		
	}


}
