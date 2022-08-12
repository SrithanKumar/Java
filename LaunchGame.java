package in.neuron.assignment.guessergame;

import java.util.Scanner;

class Guesser {
	int guessNum;
	
	
	
    public int guessNum() {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Guesser please guess the number! ");
    	
    	guessNum=sc.nextInt();
    	if(guessNum>0 && guessNum<=10) {
    		System.out.println("Excellent!!!");
    		return guessNum;
    	}else {
    		System.out.println("Guesser! please guess number between 0 to 10!!");
    	}
    	return guessNum();
	}
}



class Player {

int pguessNum;
 static int count=1;
    public int pGuessNum() {
    	Scanner sc=new Scanner(System.in);
    	 
    	System.out.println("Player"+ count +" please choose the number! ");
    	pguessNum=sc.nextInt();
    		if(pguessNum>0 && pguessNum<=10) {
    			count++;
    		return pguessNum;
    		
    		}
    		else {
    			System.out.println("Please choose between range of 0 to 10!!");
    		}
    		return pGuessNum();
	}
    	   
}

    	

class Umpire {
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;

	public void collectNumFromBoth() {

		Guesser g = new Guesser();
		numFromGuesser = g.guessNum();


		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();

		numFromPlayer1 = p1.pGuessNum();
		numFromPlayer2 = p2.pGuessNum();
		numFromPlayer3 = p3.pGuessNum();
	}

	public void compareNum() {
	
		if (numFromGuesser == numFromPlayer1) {
			if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {

				System.out.println("Game Tied! All three guessed correctly, Play Again");
			} else if (numFromGuesser == numFromPlayer2) {

				System.out.println("Player1 and Player2 won the game");
				
			} else if (numFromGuesser == numFromPlayer3) {

				System.out.println("Player1 and Player3 won the game");
			} else
				System.out.println("Player1 won the game");

		} else if (numFromGuesser == numFromPlayer2) {

			if (numFromGuesser == numFromPlayer3) {

				System.out.println("PLayer2 and Player3 won the game");
			} else
				System.out.println("Player2 won the game");

		} else if (numFromGuesser == numFromPlayer3) {

			System.out.println("Player3 won the game");

		} else
			System.out.println("Game lost! Play Again");
	}
}

public class LaunchGame {

	public static void main(String[] args) {

		Umpire u = new Umpire();
		u.collectNumFromBoth();
		u.compareNum();
	}

}
