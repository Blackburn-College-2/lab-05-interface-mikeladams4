/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab05;

/**
 *
 * @author adams
 */
public class Car implements CanTravel {

    double speed = 60;

    public Car() {
    }

    @Override
    public double move(double miles) {
        double hours;
        double minutes;
        double totalMinutes;
        double gasTime;
        gasTime = Math.floor(miles / 300) * 10;
        System.out.println("Person driving: " + miles + " miles.");
        hours = Math.floor(miles / speed);
        minutes = Math.floor(((miles / speed) - hours) * 60);
        System.out.println("It takes: " + ((int) hours + (int) Math.floor(gasTime / 60)) + " hours and " + ((int) minutes + (int) (gasTime - ((int) Math.floor(gasTime / 60) * 60))) + " minutes.");
        totalMinutes = (hours * 60) + minutes + gasTime;
        return totalMinutes;
    }
}
