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
public class Train implements CanTravel{

    double speed = 50.0;

    public Train() {
    }

    @Override
    public double move(double miles) {
        double hours;
        double minutes;
        System.out.println("Train Travels: " + miles + " miles.");
        hours = Math.floor(miles / speed);
        minutes = Math.floor(((miles / speed) - hours) * 60);
        System.out.println("It takes: " + (int) hours + " hours and " + (int) minutes + " minutes.");
        return hours;
    }
}
