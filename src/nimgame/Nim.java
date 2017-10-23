/* I affirm that this program is entirely my own work and none of it is the work of any other person.
 * @author Adrian Pardo 
 */
package nimgame;

/**
 *  The Nim class contains the game logic
 * 
 */
public class Nim {
    public Nim() {
    
    }
    
    /**
     * Play method conducts the game, keeps looping until
     * 0 marbles remain in the pile
     * @param first Pointer to Player Object that will go first
     * @param second Pointer to Player Object that will go second
     * @param pile Pointer to Pile Object
     */
    public void play(Player first, Player second, Pile pile) {
        int removed;
        while (pile.getPile() > 0) {                                            // Keep going until the pile reaches 0
            System.out.println("\n" + pile.getPile() + " marble(s) remaining");
            removed = first.move(pile.getPile());                               // First Players move method is called
            pile.remove(removed);                                               // Remove amount of marbles returned by First Players move()
            System.out.println(first.getName() + " removes " + removed +
                    " marble(s) from the pile.");
            if (pile.getPile() == 1) {                                          // If only one marble remains, force second Player to take it & game over
                System.out.println("\n1 marble remaining\n" + second.getName() + 
                        " removes 1 marble from the pile\n\n" +
                        first.getName() + " Wins!");
                break;
            }
            
            System.out.println("\n" + pile.getPile() + " marble(s) remaining");
            removed = second.move(pile.getPile());                              // Second Players move method is called
            pile.remove(removed);                                               // Remove amount of marbles returned by Second Players move()
            System.out.println(second.getName() + " removes " + removed +
                    " marble(s) from the pile.");
            if (pile.getPile() == 1) {                                          // If only one marble remains, force first Player to take it & game over
            System.out.println("\n1 marble remaining\n" + first.getName() + 
                        " removes 1 marble from the pile\n\n" +
                    second.getName() + " Wins!");
                break;
            }
        }
    }
}
