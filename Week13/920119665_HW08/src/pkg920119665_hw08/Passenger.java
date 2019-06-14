/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg920119665_hw08;

/**
 *
 * @author josep
 */
public class Passenger {
    private int passengerID;
    private int floor;
    private int destinationFloor;
    
    public Passenger(int passengerID, int floor, int destinationFloor) {
        this.passengerID = passengerID;
        this.floor = floor;
        this.destinationFloor = destinationFloor;
    }

    public int getPassengerID() {
        return passengerID;
    }

    public void setPassengerID(int passengerID) {
        this.passengerID = passengerID;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getDestinationFloor() {
        return destinationFloor;
    }

    public void setDestinationFloor(int destinationFloor) {
        this.destinationFloor = destinationFloor;
    }
    
    
    
    
}
