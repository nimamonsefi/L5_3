/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nimamonsefi
 */
public class Benz extends Car{
    private String speed;
    private String acceleration;
    private String color;

    public Benz(String speed, String acceleration, String color) {
        this.speed = speed;
        this.acceleration = acceleration;
        this.color = color;
    }
    
    @Override
    public String getSpeed() {
        return this.speed;
    }

    @Override
    public String getAcceleration() {
        return this.acceleration;
    }

    @Override
    public String getColor() {
        return this.color;
    }
    
    
}
