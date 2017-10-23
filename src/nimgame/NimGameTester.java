/* I affirm that this program is entirely my own work and none of it is the work of any other person.
 * @author Adrian Pardo 
 */

package nimgame;

import java.util.Scanner;

/**
* A tester class for the Nim Game.
* Asks the user for their name,
* whether they want to go first or second,
* and if they want to face a dumb or smart computer.
* Continues looping until user exits program.
 */
public class NimGameTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String userName;                               // String that will store users name
        Scanner reader = new Scanner(System.in);       // Creating Scanner Object
        System.out.println("What is your name?");      // Asking user for their name
        userName = reader.nextLine();                  // Storing users name
        boolean playAgain = true;                      // Boolean used for new games
        while (playAgain) {                            // While loop that runs until exited by user
            int userOrder = 0;                         // Will store the order of turns that user chooses
            int computer = 0;                          // stores whether user will face dumb(1) or smart computer(2)
            System.out.println("Welcome to Nim the Game");
            while (userOrder < 1 || userOrder > 2) {   // Keep looping until proper input
                System.out.println("\nDo you want to go first or second? "
                        + "Enter 1 or 2:");
                if (reader.hasNextInt())               // Checking for valid input
                    userOrder = reader.nextInt();      // Storing user choice of order   
                else 
                    reader.next();
            }
            while (computer < 1 || computer > 2) {     // Keep looping until proper input
                System.out.println("\nChoose Difficulty:"
                        + "\nEasy Mode(Enter 1):"
                        + "\nHard Mode(Enter 2):");
                if (reader.hasNextInt())                // Checking for valid input
                    computer = reader.nextInt();        // Storing user choice of difficulty
                else
                    reader.next();
            }
            Pile pile = new Pile();                    // Creating Pile Object
            Human human = new Human(userName);         // Creating Human Object & passing users name
            Nim nim = new Nim();                       // Creating Nim Object
            if (computer == 1) {
                DumbComputer dumb = new DumbComputer();// Creating DumbComputer Object
                if (userOrder == 1)                    // If statement for properly passing turn order to play()
                    nim.play(human,dumb,pile);
                else
                    nim.play(dumb,human,pile);
            }
            else {
                SmartComputer smart = new SmartComputer();  // Creating SmartComputer Object
                if (userOrder == 1)                    // If statement for properly passing turn order to play()
                    nim.play(human,smart,pile);
                else
                    nim.play(smart,human,pile);
            }
            System.out.println("\nPress 1 to play again"
                    + "\nOr anything else to exit");
            // Ternary operator to see if user wants to play again and checks for valid input
            playAgain = (reader.hasNextInt() && reader.nextInt() == 1) ?   true: false;    
        }
    }
}
