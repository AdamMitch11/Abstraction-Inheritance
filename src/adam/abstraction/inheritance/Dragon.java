
package adam.abstraction.inheritance;

/**
 *
 * @author Adam
 */
public class Dragon implements Creature, IntelligentCreature, Flying{
    private int age;
    
    @Override
    public void setAge(int age){
        this.age=age;
    }
    @Override
    public int getAge(){
        return age;
    }
    @Override
    public void fly(){
        //fly you fools
    }
    @Override
    public String speak(){
        String speak="Dovahkiin";
        return speak;
    }
}
