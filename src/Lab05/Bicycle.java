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
public class Bicycle implements CanTravel {

    double speed = 15;
    boolean flat = false;

    public Bicycle() {
    }

    @Override
    public double move(double miles) {
        double milesBeforeFlat = 0;
        for (int i = 0; i < miles; i++) {
            if (flat == true) {
                break;
            }
            int x = (int) (Math.random() * 100) + 1;
            System.out.println(x);
            if (x == 1) {
                milesBeforeFlat = i;
                flat = true;
                break;
            }
        }
        if (flat == true) {
            double walkingMiles = miles - milesBeforeFlat;
            double bikeHours;
            double walkHours;
            double bikeMinutes;
            double walkMinutes;
            double totalMinutes;
            double hoursFromMinutes;
            System.out.println("Person riding: " + milesBeforeFlat + " miles.");
            System.out.println("Flat tire! Had to walk: " + walkingMiles + " miles");
            bikeHours = Math.floor(milesBeforeFlat / speed);
            walkHours = Math.floor(walkingMiles / 5.5);
            bikeMinutes = Math.floor(((milesBeforeFlat / speed) - bikeHours) * 60);
            walkMinutes = Math.floor(((walkingMiles / 5.5) - walkHours) * 60);
            hoursFromMinutes = Math.floor((bikeMinutes + walkMinutes) / 60);
            System.out.println("It takes: " + ((int) bikeHours + (int) walkHours + (int) hoursFromMinutes) + " hours and " + ((((int) bikeMinutes + (int) walkMinutes) - (int) (hoursFromMinutes * 60))) + " minutes.");
            totalMinutes = (bikeHours * 60) + (walkHours * 60) + bikeMinutes + walkMinutes;
            return totalMinutes;
        } else {
            double hours;
            double minutes;
            double totalMinutes;
            System.out.println("Person riding: " + miles + " miles.");
            hours = Math.floor(miles / speed);
            minutes = Math.floor(((miles / speed) - hours) * 60);
            System.out.println("It takes: " + (int) hours + " hours and " + (int) minutes + " minutes.");
            totalMinutes = (hours * 60) + minutes;
            return totalMinutes;
        }
    }
}
