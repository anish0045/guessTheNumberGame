import java.util.Random;
import java.util.Scanner;
class Game {
    public int number;
    public int inputNumber;
    public int noOfGuesses=0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses=noOfGuesses;
    }

    Game() {
        Random rand=new Random();
        this.number=rand.nextInt(100);
    }
    void takeUserInput() {
        System.out.println("Guess The Number");
        Scanner sc=new Scanner(System.in);
        inputNumber=sc.nextInt();
    }
    boolean isCorrectNumber() {
        noOfGuesses++;
        if (inputNumber==number) {
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts",number);
            return true;
        } else if (inputNumber<number) {
            System.out.println("Too Low");
        } else if (inputNumber>number) {
            System.out.println("Too High");
        }
        return false;
    }
}
public class AB22_guessTheNumberGame {
    public static void main(String[] args) {
        /*
        The number is between 1 to 100

        Create a class Game, which allowss a user to play "Guess The Number"
        game once. Game should have the following methods
        1. constructors to generate the random number
        2 takeUserInput() to take user input of number
        3. isCorrectNumber() to detect whether the number entered by the user is true
        4. getter and setter for noOfGuesses
        Use properties such as noOfGuesses(int), etc to get this task done
        */

        Game g =new Game();
        boolean b=false;
        while (!b) {
            g.takeUserInput();
            b=g.isCorrectNumber();
        }

    }
}
