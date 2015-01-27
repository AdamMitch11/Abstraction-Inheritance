
package adam.abstraction.inheritance;

/**
 *
 * @author Adam
 */
public abstract class Mob implements Entity{
    //private int mobID;
    public void moveMob(){
        //move
    }
    
    public abstract void setMobID(int newMobID);
    public abstract int getMobID();
}
