import java.util.Random;  //importing random library
import java.util.Scanner;  //importing scanner library

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //new Scanner(System.in) is used to take input from user
        System.out.println("Welcome to Rock-Paper-Scissors Game! Please input \"rock\", \"paper\", or \"scissors\", or \"exit\" to exit the game.");
        System.out.print("User's move: ");
        String userInput = scanner.nextLine(); //This initiate the game, create variable userInput, and assigning it the value of the user's input. nextLine() is a method of the Scanner class that reads strings.
        

        
        Random rand = new Random(); //creating/intialising random object
        int randomInteger = rand.nextInt(3); //generating random integer
        //System.out.println(randomInteger); //printing random integer


        String[] handSigns = {"rock", "paper", "scissors"}; //creating array of hand signs (arrays in Java use curly brackets). String[] is declared first because this is the data type within the handSigns array: strings

        String computer = handSigns[randomInteger]; //creating variable computer and assigning it the value of the random integer (0, 1, or 2)
        System.out.println("Computer's move: " + computer); //printing computer

        String winner = ""; //creating variable winner and assigning it the value of an empty string since we don't know the winner yet
        
        //comparison by value in Java =/= Javascript. In Javascript when you use ==, it compares the value. But in Java == compares the reference. Instead, in Java, we use .equals() to compare the value. Also, it will count wins and losses for userInput.
        
        int wins = 0;
        int losses = 0; 
        int draw = 0;

        if (userInput.equals("quit")) {
        System.out.println("You won " + wins + " times and lost " + losses + " times.");
        System.out.println("Thanks for playing! See you next time!");
        
        }//To count the wins and losses for the Game after quitting.
        
        if ((userInput.equals("paper") && computer.equals("rock"))||(userInput.equals("rock") && computer.equals("scissors"))||
        (userInput.equals("scissors") && computer.equals("paper"))) {
            winner = "Player";
            wins++; //count wins

        } else if ((userInput.equals("rock") && computer.equals("paper"))||(userInput.equals("scissors") && computer.equals("rock"))||
        (userInput.equals("paper") && computer.equals("scissors"))){
            winner = "Computer";
            losses++; //count losses

        } else {
            winner = "It's a draw!";  //When user make the same move as computer, it's a draw!
            draw++; //count draw
        }
            
        System.out.println("The winner is: " + winner);
         //printing winner
        System.out.println("You won " + wins + " times and lost " + losses + " times."+ draw +" draw"); //printing wins and losses
        System.out.println("Thanks for playing! See you next time!"); //printing thanks for playing
    }
        
    

}
// return random number between 0 to 2 ('scissor' 'paper' 'stone')
//take in user input
// bunch of if else statements to determine winner (scissor beats paper, paper beats stone, stone beats scissor)
