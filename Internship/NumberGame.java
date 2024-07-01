import java.util.*;

public class NumberGame{

    //Constructor
    NumberGame(){
        Scanner reader = new Scanner(System.in);
        String play = "yes";

        //to determine if we are going to play the game again
        while(play.equals("yes")){

            Random rand = new Random();
            int randNum = rand.nextInt(100);
            int guess = -1;
            int tries = 0;

            //to check if the game is over
            while(guess!=randNum){

                System.out.print("Guess a Number Between 1 and 100: ");
                guess = reader.nextInt();
                tries++;
                if(guess == randNum){
                    System.out.println("Awesome! You Guessed The Right Number!");
                    System.out.println("It Only Took You " + tries + " Guesses!");
                    System.out.println("Would You like to Play again? Yes or No: ");
                    play = reader.next().toLowerCase();
                } else if(guess> randNum) {
                    System.out.println("Your Guess is Too High, try again.");
                } else{
                    System.out.println("Your Guess is Too Low, try again.");
                }

            }

        }
        reader.close();

    }
    public static void main(String args[]) {
        new NumberGame();
    }
}