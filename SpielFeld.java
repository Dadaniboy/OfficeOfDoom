import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SpielFeld extends Canvas implements KeyListener{
	
	private static final long serialVersionUID = -8853917516097245471L;
	int xAv, yAv;
		
	
	public SpielFeld () {
		
		this.setBackground(Color.DARK_GRAY);
		this.setFocusable(true);
		addKeyListener(this);
		
	}
	
	@Override
	public void paint (Graphics g) {
		
		g.setColor(Color.RED);
		g.drawOval(xAv, yAv, 64, 64);
		
	}

	public void avDown() {
		if (yAv < 640-64){
		yAv = yAv + 64;}
		this.repaint();
		
	}
	
	public void avUp() {
		if (yAv > 0){
			yAv = yAv - 64;}
		this.repaint();}
	
	public void avLeft() {
		if (xAv > 0){
			xAv = xAv - 64;}
		this.repaint();}
	
	public void avRight() {
		if (xAv < 640-64){
			xAv = xAv + 64;}
		this.repaint();}
	

	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();

        if (code == KeyEvent.VK_UP){
        	avUp();
        }

        if (code == KeyEvent.VK_DOWN){
        	avDown();
        }

        if (code == KeyEvent.VK_LEFT){
        	avLeft();
        }

        if (code == KeyEvent.VK_RIGHT){
        	avRight();
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
