/* I affirm that this program is entirely my own work and none of it is the work of any other person.
 * @author Adrian Pardo 
 */
package nimgame;

import java.util.Scanner;

/**
 *  The Human class is user controlled
 */
public class Human implements Player {
    private String name = "";
    Scanner reader = new Scanner(System.in);   
    
    /**
     * Creates Human Object and stores the name
     * @param name name the user wants to be known as
     */
    Human(String name) {
        this.name = name;
    }
    
    /**
     * @return name of the Human user
     */
    public String getName() {
        return name;
    }
    
    /**
     * The move method asks the user how many marbles to remove 
     * & makes sure the user doesn't cheat 
     * @param pile current amount of marbles, used to check no more than half
     * the pile is selected to be removed
     * @return the amount of marbles the user is going to remove
     */
    public int move(int pile) {
        int remove = 0;
        while (remove < 1 || remove > pile/2) {
            System.out.println("How many marbles do you want to remove?");
            if (reader.hasNextInt())
                remove = reader.nextInt();
            else
                reader.next();
        }
        return remove;
    }
}
