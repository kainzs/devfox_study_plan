import java.io.*;

public class GameJava2_06 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Hangman hangman = new Hangman();
		
		int result = hangman.playGame();
		
		System.out.println();
		if(result <= 2) {
			System.out.println("very good");
		}else if(result<=3) {
			System.out.println("good");
		}else if(result<=4) {
			System.out.println("soso");
		}else {
			System.out.println("not good..");
		}
	}

}
