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
public class Running implements CanTravel {

    double speed = 10;

    public Running() {
    }

    @Override
    public double move(double miles) {
        double hours;
        double minutes;
        double totalMinutes;
        double rest;
        rest = Math.floor(miles / 2) * 5;
        System.out.println("Person running: " + miles + " miles.");
        hours = Math.floor(miles / speed);
        minutes = Math.floor(((miles / speed) - hours) * 60);
        System.out.println("It takes: " + ((int) hours + (int) Math.floor(rest / 60)) + " hours and " + ((int) minutes + (int) (rest - ((int) Math.floor(rest / 60) * 60))) + " minutes.");
        totalMinutes = (hours * 60) + minutes + rest;
        return totalMinutes;
    }

}
