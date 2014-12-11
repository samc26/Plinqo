
public class Puck {
	int currentBin;

	public int getCurrentBin() {
		return currentBin;
	}

	public void setCurrentBin(int currentBin) {
		this.currentBin = currentBin;
	}
	public void printPuckLocation(){
		if (currentBin == 0){
			System.out.println("o _ _ _ _ _ _ _ _");
		}
		if (currentBin == 1){
			System.out.println("_ o _ _ _ _ _ _ _");
		}
		if (currentBin == 2){
			System.out.println("_ _ o _ _ _ _ _ _");
		}
		if (currentBin == 3){
			System.out.println("_ _ _ o _ _ _ _ _");
		}
		if (currentBin == 4){
			System.out.println("_ _ _ _ o _ _ _ _");
		}
		if (currentBin == 5){
			System.out.println("_ _ _ _ _ o _ _ _");
		}
		if (currentBin == 6){
			System.out.println("_ _ _ _ _ _ o _ _");
		}
		if (currentBin == 7){
			System.out.println("_ _ _ _ _ _ _ o _");
		}
		if (currentBin == 8){
			System.out.println("_ _ _ _ _ _ _ _ o");
		}
	}
}
