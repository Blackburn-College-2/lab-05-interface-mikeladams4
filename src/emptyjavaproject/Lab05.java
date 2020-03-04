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
public class Lab05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Walk Walk = new Walk();
        Plane Plane = new Plane();
        Train Train = new Train();
        roundTrip(Walk, 10);
    }

    public static void roundTrip(CanTravel x, double miles) {
        double totalMinutes;
        double hours;
        double minutes;
        System.out.println("Round Trip! \nLeaving...");
        totalMinutes = x.move(miles);
        System.out.println("Returning...");
        totalMinutes = x.move(miles) + totalMinutes;
        hours = Math.floor(totalMinutes / 60);
        minutes = Math.floor(((totalMinutes / 60) - hours) * 60);
        System.out.println("Total Travel time: " + (int) hours + " hours and " + (int) minutes + " minutes.");
    }
}
