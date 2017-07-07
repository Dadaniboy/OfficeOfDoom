
public class SpielFeldRaster {

	Feld[][] Feldinit;
	int FeldNum = 1;
	public  SpielFeldRaster() {
	Feldinit = new Feld [10][10];
	for (int i = 0; i < 10; i++){
		for (int j = 0; j < 10; j++){
			
			Feldinit[i][j] = new Feld(FeldNum,i*64,j*64);
			FeldNum++;
		}
		
	}
	}
	public Feld[][] getFeldinit() {
		return Feldinit;
	}

	
	public int getFeldNum() {
		return FeldNum;
	}

	
	
	
}
