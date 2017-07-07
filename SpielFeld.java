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
	
	// Implementiert die eigentliche Spielmechanik
	
	// Konstanten	
	private static final long serialVersionUID = -8853917516097245471L;
	final int Die64 = 64; // Zur einfacheren Angabe von Koordinaten, jedes Feld hat 64 x 64 pixel
	
	// Variablen zur Behandlung von beweglichen Objekten
	
	Akte[][] Akten = new Akte[9][9]; // Array zur Behandlung von Akten
	Zombie [][] Zombies = new Zombie[9][9];
	Spieler Avatar = new Spieler();
		
	// Referenzvariablen für Bilder
	Image bkgrnd = null;
	Image avatar = null;
	Image inbox = null;
	Image akte = null;
	
	public SpielFeld () {
		
		this.setBackground(Color.DARK_GRAY);
		this.setFocusable(true);
		this.setSize(getWidth(), getHeight());
		addKeyListener(this);
				
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
		// Inbox laden in inbox
		try {
			File sourceimage = new File("Recources/Assets/ablage.png");
			inbox = ImageIO.read(sourceimage);}
		catch (IOException e) {
		 	e.printStackTrace();
			System.out.println("Ablage kann nicht geladen werden");
		}
		
		// Akte laden in akte
		try {
			File sourceimage = new File("Recources/Assets/akte.png");
			akte = ImageIO.read(sourceimage);}
		catch (IOException e) {
		 	e.printStackTrace();
			System.out.println("Akte kann nicht geladen werden");
		}
				
	}
	
	@Override
	public void paint (Graphics g) {
		
		// Zeichnen der statischen Objekte
		
		g.drawImage(bkgrnd, 0, 0, null);
		g.drawImage(inbox, 7*Die64, 0, null);
		
		// Zeichnen der dynamischen Objekte
		
		g.drawImage(avatar, Avatar.getX()*Die64, Avatar.getY()*Die64, null);
		g.drawImage(akte, 6*Die64, 0, null); // nur zum testen
		

	}

	public void avDown() {
		if (Avatar.getY() < 9){
			Avatar.yIncrease();}
		this.repaint();
	}
	
	public void avUp() {
		if (Avatar.getY() > 0){
			Avatar.yDecrease();}
		this.repaint();}
	
	public void avLeft() {
		if (Avatar.getX() > 0){
			Avatar.xDecrease();}
		this.repaint();}
	
	public void avRight() {
		if (Avatar.getX() < 9){
			Avatar.xIncrease();;}
		this.repaint();}
	
	public void avWait() {
		this.repaint();
	}
	

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
        
        if (code == KeyEvent.VK_SPACE){
        	avWait();
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
