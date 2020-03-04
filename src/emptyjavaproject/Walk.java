/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author mikel.adams
 */
public class Walk implements CanTravel {

    double speed = 5.5;

    public Walk() {
    }

    @Override
    public double move(double miles) {
        double hours;
        double minutes;
        double totalMinutes;
        System.out.println("Person walking: " + miles + " miles.");
        hours = Math.floor(miles/speed);
        minutes = Math.floor(((miles/speed) - hours) * 60);
        System.out.println("It takes: " + (int)hours + " hours and " + (int)minutes + " minutes.");
        totalMinutes = (hours*60) + minutes;
        return totalMinutes;
    }

}
