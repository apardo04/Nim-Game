/* I affirm that this program is entirely my own work and none of it is the work of any other person.
 * @author Adrian Pardo 
 */
package nimgame;

import java.util.Random ;
/**
 *  SmartComputer class implements a specific strategy
 */
public class SmartComputer implements Player {
    private String name = "Smart Computer";
    Random generator = new Random() ;
    
    /**
     * SmartComputer Constructor
     */
    SmartComputer() {}
    
    /**
     * @return SmartComputers name
     */
    public String getName() {
        return name;
    }
    
    /**
     * SmartComputer always removes whatever amount of marbles necessary to leave
     * a power of 2 minus 1 marbles remaining in the pile
     * @param pile current number of marbles in the pile
     * @return how many marbles SmartComputer wants to remove from the pile
     */
    public int move(int pile) {
        int remove = 0;
        int [] powersMinusOne = {63,31,15,7,3,1};           // array of powers of 2 minus one, that are elss than 100
        for (int i = 0; i < powersMinusOne.length; i++) {   // loop through the array
            if (powersMinusOne[i] < pile &&                 // if the power of 2 - 1 is less than the pile then
                    pile - powersMinusOne[i] <= pile/2) {   // AND pile minus that power of 2 - 1 is less than half the pile
                remove = pile - powersMinusOne[i];          // store in remove, until if we find a higher legal number
            }
        }
        if (remove != 0)
            return remove;
        else
            return generator.nextInt(pile / 2) + 1;         // If unable to remove a power of 2 - 1, randomly choose(because it really doesn't matter)
    }
}
