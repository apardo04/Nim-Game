/* I affirm that this program is entirely my own work and none of it is the work of any other person.
 * @author Adrian Pardo 
 */
package nimgame;

import java.util.Random ;

/**
 *  The Dumb Computer class randomly selects between
 *  1 and pile/2 marbles
 */
public class DumbComputer implements Player{
    private String name = "Dumb Computer";
    Random generator = new Random() ;
    
    /**
     * DumbComputer constructor
     */
    DumbComputer() {
    }
    
    /**
     * @return Dumb Computers name
     */
    public String getName() {
        return name;
    }
    
    /**
     * 
     * @param pile current amount of marbles in the pile
     * @return A random number between 1 and pile/2
     */
    
    public int move(int pile) {
        return generator.nextInt(pile / 2) + 1;
    }
}
