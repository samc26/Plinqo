import java.util.Random;

public class Bins {
	int[] outcome = {0,1,2,3,4,5,6,7,8};
	Random rng = new Random();
	
	public int nextTurnBin (Puck currentBin){
		int nextBin = currentBin.getCurrentBin();
		boolean leftRight = rng.nextBoolean();
		if(leftRight && nextBin != 0){
			nextBin = nextBin-1;
		}
		else{
			if(nextBin != 8){
				nextBin++;				
			}
		}
		return nextBin;
	}
}
