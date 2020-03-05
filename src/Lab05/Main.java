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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Walk Walk = new Walk();
        Plane Plane = new Plane();
        Train Train = new Train();
        Bicycle Bicycle = new Bicycle();
        Car Car = new Car();
        Rollerskates Rollerskates = new Rollerskates();
        Running Running = new Running();
        roundTrip(Walk, 10);
        roundTrip(Plane, 10);
        roundTrip(Train, 10);
        roundTrip(Car, 600);
        roundTrip(Rollerskates, 10);
        roundTrip(Bicycle, 10);
        roundTrip(Running, 12);
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
