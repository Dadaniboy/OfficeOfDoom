import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class SpielFeld extends Canvas implements KeyListener{
	
	private static final long serialVersionUID = -8853917516097245471L;
	int xAv, yAv;
	
	Image bkgrnd = null;
	Image avatar = null;
	Image zombie = null;
	SpielFeldRaster Rasti = new SpielFeldRaster();
	Feld Feldi[][] =new Feld[10][10];
	public SpielFeld () {
		for (int i = 0; i < 10; i++){
			for (int j = 0; j < 10; j++){
				Feldi[i][j] = Rasti.Feldinit[i][j];
			}
		}
		this.setBackground(Color.DARK_GRAY);
		this.setFocusable(true);
		this.setSize(getWidth(), getHeight());
		addKeyListener(this);
		Feldi[9][2].zombieAnwesend = true;
		Feldi[8][4].zombieAnwesend = true;
		// Hintergrund laden in bkgrnd
		try {
			File sourceimage = new File("Recources/LevelBackground/floor1.png");
			bkgrnd = ImageIO.read(sourceimage);}
		catch (IOException e) {
	    	e.printStackTrace();
			System.out.println("Hintergrund kann nicht geladen werden");
		}
		// Avatar laden in avatar
		try {
			File sourceimage = new File("Recources/Avatars/Avatar1.png");
			avatar = ImageIO.read(sourceimage);}
		catch (IOException e) {
		 	e.printStackTrace();
			System.out.println("Avatar kann nicht geladen werden");
		}
		// Zombie laden in zombie
				try {
					File sourceimage = new File("Recources/Avatars/Zombie.png");
					zombie = ImageIO.read(sourceimage);}
				catch (IOException e) {
				 	e.printStackTrace();
					System.out.println("Zombie kann nicht geladen werden");
				}
				
	}
	
	@Override
	public void paint (Graphics g) {
		g.drawImage(bkgrnd, 0, 0, null);
		g.drawImage(avatar, xAv, yAv, null);
		
		
		for (int i = 0; i < 10; i++){
			for (int j = 0; j < 10; j++){
			
			if (Feldi[i][j].zombieAnwesend){
				g.drawImage(zombie, Feldi[i][j].getXBound(), Feldi[i][j].getYBound(), null);
			
			}
				
			}
				
			}
		

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
