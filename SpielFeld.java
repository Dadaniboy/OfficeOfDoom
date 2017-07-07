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
<<<<<<< HEAD
	int xAv, yAv;
=======
	final int Die64 = 64; // Zur einfacheren Angabe von Koordinaten, jedes Feld hat 64 x 64 pixel
	
	// Variablen zur Behandlung von beweglichen Objekten anlegen und initialisieren
	Akte[][] Akten = new Akte[9][9]; // Array zur Behandlung von Akten
	Zombie[][] Zombies = new Zombie[9][9]; // Array zur Behandlung von Zombies
	Spieler Avatar = new Spieler();
	
	// Sonstige Variablen
	int Score = 0;
	int Runde = 0;
		
	// Referenzvariablen für Bilder
	Image bkgrnd = null;
	Image avatar = null;
	Image inbox = null;
	Image akte = null;
	Image zombie = null;
>>>>>>> branch 'master' of https://github.com/Faxinger/OfficeOfDoom.git
	
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
<<<<<<< HEAD
		Feldi[9][2].zombieAnwesend = true;
		Feldi[8][4].zombieAnwesend = true;
=======
				
>>>>>>> branch 'master' of https://github.com/Faxinger/OfficeOfDoom.git
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
<<<<<<< HEAD
		// Zombie laden in zombie
				try {
					File sourceimage = new File("Recources/Avatars/Zombie.png");
					zombie = ImageIO.read(sourceimage);}
				catch (IOException e) {
				 	e.printStackTrace();
					System.out.println("Zombie kann nicht geladen werden");
				}
=======
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
		
		// Zombie laden in zombie
				try {
					File sourceimage = new File("Recources/Avatars/Zombie.png");
					zombie = ImageIO.read(sourceimage);}
				catch (IOException e) {
				 	e.printStackTrace();
					System.out.println("Zombie kann nicht geladen werden");
		}
>>>>>>> branch 'master' of https://github.com/Faxinger/OfficeOfDoom.git
				
	}
	
	@Override
	public void paint (Graphics g) {
		
		// Zeichnen der statischen Objekte
		
		g.drawImage(bkgrnd, 0, 0, null);
		g.drawImage(inbox, 7*Die64, 0, null);
		
		// Zeichnen der dynamischen Objekte
		
		g.drawImage(avatar, Avatar.getX()*Die64, Avatar.getY()*Die64, null);
		g.drawImage(akte, 6*Die64, 0, null); // nur zum testen
		
		
		for (int i = 0; i < 10; i++){
			for (int j = 0; j < 10; j++){
			
			if (Feldi[i][j].zombieAnwesend){
				g.drawImage(zombie, Feldi[i][j].getXBound(), Feldi[i][j].getYBound(), null);
			
			}
				
			}
				
			}
		

	}
<<<<<<< HEAD

	public void avDown() {
		if (yAv < 640-64){
		yAv = yAv + 64;}
	   		
		this.repaint();
=======
	
	void LeisteAktualisieren() {
>>>>>>> branch 'master' of https://github.com/Faxinger/OfficeOfDoom.git
		
				
	}
	
	void AktenAktualisieren() {
		
		
	}
	
	void ZombiesAktualisieren() {
		
		
	}
	
	void RundenEnde() {
		
		AktenAktualisieren();
		ZombiesAktualisieren();
		LeisteAktualisieren();
		Runde ++;
				
	}
	
	public void avDown() {
		if (Avatar.getY() < 9){
			Avatar.yIncrease();}
		RundenEnde();
		this.repaint();
	}
	
	public void avUp() {
		if (Avatar.getY() > 0){
			Avatar.yDecrease();}
		RundenEnde();
		this.repaint();}
	
	public void avLeft() {
		if (Avatar.getX() > 0){
			Avatar.xDecrease();}
		RundenEnde();
		this.repaint();}
	
	public void avRight() {
		if (Avatar.getX() < 9){
			Avatar.xIncrease();;}
		RundenEnde();
		this.repaint();}
	
	public void avWait() {
		RundenEnde();
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
