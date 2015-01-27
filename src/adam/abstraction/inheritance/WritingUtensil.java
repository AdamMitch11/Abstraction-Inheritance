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
public class WritingUtensil implements Tool, HumanTool, HandTool{
    @Override
    public void useTool(){
        //use the tool
    }
    @Override
    public void constructTool(){
        //make a new desired tool
    }
    public String writeNote(String note){
        return note;
    }
}
