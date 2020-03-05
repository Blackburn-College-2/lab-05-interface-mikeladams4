/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab05;

/**
 *
 * @author mikel.adams
 */
public class Plane implements CanTravel{

    double speed = 450.0;

    public Plane() {
    }

    @Override
    public double move(double miles) {
        double hours;
        double minutes;
        double totalMinutes;
        System.out.println("Plane Travels: " + miles + " miles.");
        hours = Math.floor(miles / speed);
        minutes = Math.floor(((miles / speed) - hours) * 60);
        hours = hours + 2;
        System.out.println("It takes: " + (int) hours + " hours and " + (int) minutes + " minutes.");
        totalMinutes = (hours*60) + minutes;
        return totalMinutes;
    }
}
