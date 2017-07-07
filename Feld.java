
public class Feld {
	
	
	int FeldNr, XBound, YBound;
	boolean betretbar, spielerAnwesend, zombieAnwesend,akteAnwesend;
	
	public Feld(int Nr, int x, int y){
		zombieAnwesend = false;
		FeldNr = Nr;
		XBound = x;
		YBound = y;
		System.out.println(FeldNr+ ": "+ x + " "+ y);
		
	}
	
	public int getFeldNr() {
		return FeldNr;
	}

	public int getXBound() {
		return XBound;
	}

	public int getYBound() {
		return YBound;
	}

	public boolean isBetretbar() {
		return betretbar;
	}

	public void setBetretbar(boolean betretbar) {
		this.betretbar = betretbar;
	}
	public boolean isSpielerAnwesend() {
		return spielerAnwesend;
	}
	public void setSpielerAnwesend(boolean spielerAnwesend) {
		this.spielerAnwesend = spielerAnwesend;
	}
	public boolean isZombieAnwesend() {
		return zombieAnwesend;
	}
	public void setZombieAnwesend(boolean zombieAnwesend) {
		this.zombieAnwesend = zombieAnwesend;
	}
	public boolean isAkteAnwesend() {
		return akteAnwesend;
	}
	public void setAkteAnwesend(boolean akteAnwesend) {
		this.akteAnwesend = akteAnwesend;
	}
	
}
