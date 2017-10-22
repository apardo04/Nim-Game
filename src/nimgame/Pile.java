/* I affirm that this program is entirely my own work and none of it is the work of any other person.
 * @author Adrian Pardo 
 */
package nimgame;

import java.util.Random ;

/**
 *  The Pile class keeps track of how many marbles are still in play
 */
public class Pile {
    private int pileSize = 0;
    /**
     * The Pile class constructor generates a random number of marbles from 10 - 100 
     */
    public Pile() {
        Random generator = new Random() ;
        pileSize = generator.nextInt((100 - 10) + 1) + 10;
    }
    
    /**
     * @return The number of marbles in the pile
     */
    public int getPile() {
        return pileSize;
    }
    
    /**
     * Removes marbles from pileSize
     * @param tobeRemoved The number of marbles to be removed from the pile
     */
    public void remove(int tobeRemoved) {
        pileSize -= tobeRemoved;
    }
}
