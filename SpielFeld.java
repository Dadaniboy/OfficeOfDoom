import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SpielFeld extends Canvas implements KeyListener{
	
	private static final long serialVersionUID = -8853917516097245471L;
	private int xAv, yAv;
		
	
	public SpielFeld (int xAv, int yAv) {
		
		this.xAv = xAv;
		this.yAv = yAv;
		this.setBackground(Color.DARK_GRAY);
		addKeyListener(this);
		
	}
	
	@Override
	public void paint (Graphics g) {
		
		g.setColor(Color.RED);
		g.drawOval(xAv, yAv, 64, 64);
		
	}

	public int getyAv() {
		return yAv;
	}

	public void setyAv(int yAv) {
		this.yAv = yAv;
	}

	public int getxAv() {
		return xAv;
	}

	public void setxAv(int xAv) {
		this.xAv = xAv;
	}
	
	public void avDown() {
		
		yAv =- 64;
		this.repaint();
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		System.out.println(e.getKeyCode());

        if (code == KeyEvent.VK_UP){
        }

        if (code == KeyEvent.VK_DOWN){
        	avDown();
        	System.out.println("HUlapalu");
        }

        if (code == KeyEvent.VK_LEFT){

        }

        if (code == KeyEvent.VK_RIGHT){

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
