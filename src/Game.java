import java.util.Scanner;

public class Game {
	Puck daPuck = new Puck();
	Bins currentBins = new Bins();
	Scanner keyboard = new Scanner(System.in);	

	
	public void playGame(){
		System.out.println("where do u want to start?");
		int startBin = keyboard.nextInt();
		daPuck.setCurrentBin(startBin);
		for (int i=0; i<20; i++){
			daPuck.setCurrentBin(currentBins.nextTurnBin(daPuck));
			daPuck.printPuckLocation();
		}
		
	}
}
