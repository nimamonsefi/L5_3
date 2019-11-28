/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nimamonsefi
 */
public class CarFactory {
    public static Car getCar(String brand,String speed
            ,String acceleration,String color){
        if("Benz".equalsIgnoreCase(brand)) return new Benz(speed
                , acceleration, color);
        else if("Bmw".equalsIgnoreCase(brand)) return new Bmw(speed
                , acceleration, color);
        return null;
    }
}
