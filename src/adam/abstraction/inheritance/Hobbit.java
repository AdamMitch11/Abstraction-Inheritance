
package adam.abstraction.inheritance;

/**
 *
 * @author Adam
 */
public class Hobbit implements Creature, MiddleEarthInhabitant, Humanoid{
    private int age;
    private String name;
    
    @Override
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public int getAge(){
        return age;
    }
    @Override
    public void walk(){
        //walk
    }
    
}
