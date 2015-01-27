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
public abstract class Tank implements Vehicle, ArmoredVehicle {
    private int crew;
    private float armorInches;
    private float armorMillimeters;
    @Override
    public void moveVehicle() {
        //move the tank
    }
    @Override
    public float getArmorThicknessIN() {
         return armorInches;
    }
    @Override
    public float getArmorThicknessMM() {
         return armorMillimeters;
    }
    //setters would be included
    public abstract void fireMainArmament();
}
