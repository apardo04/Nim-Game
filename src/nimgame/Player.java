/* I affirm that this program is entirely my own work and none of it is the work of any other person.
 * @author Adrian Pardo 
 */
package nimgame;

/**
 * Player interface
 */
public interface Player {
    /**
     * Checks that the Class using this method doesn't cheat!
     * @param pile will feed the current amount of marbles in the pile
     */
    int move(int pile);
    
    /**
     * Used to return the name of the person using the class
     * that is implementing this interface =)
     */
    String getName();
}
