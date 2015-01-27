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
public class Precipitation extends WeatherPattern{
    @Override
    public void doSomething(){
        //start event
    }
    
    private double totalPrecipitation;
    
    public double getTotalPrecipitation(){
        return totalPrecipitation;
    }
    //and setter
}
