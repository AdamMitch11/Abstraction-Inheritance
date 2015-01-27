/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adam.abstraction.inheritance;

/**
 *
 * @author Adam
 */
public class PlayableCharacter extends Mob {
    private String name;
    private int mobID;
    
    @Override
    public int getMobID(){
        return mobID;
    }
    @Override
    public void setMobID(int newMobID){
        this.mobID=newMobID;
    }
    @Override
    public void drawEntity(){
        //draw the entity
    }
}
