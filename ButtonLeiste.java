import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ButtonLeiste extends JLabel implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1561L;
	
	JButton Start = new JButton("Start");
	JButton Optionen = new JButton("Optionen");
	JButton Ende = new JButton("Ende");
	JTextField leer = new JTextField();
	public ButtonLeiste(){
		this.setSize(640, 64);
		this.setBackground(Color.DARK_GRAY);
		
		Start.setLocation(0, 0);
		Start.setSize(128, 64);
		Start.addActionListener(this);
		Start.setBackground(Color.ORANGE);
		Start.setFont(new Font("Arial",Font.BOLD, 16));
		Optionen.setLocation(128+1, 0);
		Optionen.setSize(128, 64);
		Optionen.addActionListener(this);
		Optionen.setBackground(Color.ORANGE);
		Optionen.setFont(new Font("Arial",Font.BOLD, 16));
		Ende.setLocation(128+1+128+1,0);
		Ende.setSize(128, 64);
		Ende.addActionListener(this);
		Ende.setBackground(Color.ORANGE);
		Ende.setFont(new Font("Arial",Font.BOLD, 16));
		leer.setBackground(Color.DARK_GRAY);
		leer.setEditable(false);
		leer.setForeground(Color.WHITE);
		leer.setLocation(128+1+128+1+128,0);
		leer.setSize(640-(128+1+128+1+128), 64);
		this.add(Start);
		this.add(Optionen);
		this.add(Ende);
		this.add(leer);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Start ){
						
		}
		if (e.getSource() == Optionen ){
			
		}
		
		if (e.getSource() == Ende ){
			System.exit(0);	
		
		
}
		
		
		// TODO Auto-generated method stub
		
	}
	
	
	
}
