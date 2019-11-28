/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nimamonsefi
 */
public abstract class Car {
    public abstract String getSpeed();
    public abstract String getAcceleration();
    public abstract String getColor();
    
    @Override
    public String toString(){
        return "Speed:"+this.getSpeed()+" Acceleration:"
                +this.getAcceleration()+" Color:"+this.getColor();
    }
}
