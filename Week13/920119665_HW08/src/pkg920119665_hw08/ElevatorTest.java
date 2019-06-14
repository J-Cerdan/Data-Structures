/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg920119665_hw08;

import java.util.Random;

/**
 *
 * @author josep
 */
public class ElevatorTest {
    
    private static final int MAX_FLOORS = 5;
    
    static int randomPassengers(List<Passenger> list, int floor, int ID){
        Passenger passenger;
        Random randPassengers = new Random();
        Random randFloor = new Random();
        int destinationFloor;
        int passengerAmount = randPassengers.nextInt(5);
        for (int i=0; i<passengerAmount; i++){
            destinationFloor = 1+randFloor.nextInt(4);
            
            if (destinationFloor != floor){
                passenger = new Passenger(ID+i+1, floor, destinationFloor);
                list.add(passenger);
            }
        }
        
        return passengerAmount;
    }
    
    static void PrintList(List<Passenger> list, int ID) {
        System.out.print("Passenger{");
            System.out.print("passengerID=");
            System.out.print(list.getEntry(ID).getPassengerID() + ", ");
            System.out.print("floor=");
            System.out.print(list.getEntry(ID).getFloor()+ ", ");
            System.out.print("destinationFloor=");
            System.out.print(list.getEntry(ID).getDestinationFloor());

        
        System.out.println("}");
    }
    
    static int moveinPassengers(List<Passenger> floor, List<Passenger> elevator, int floorN){
                        
        int count = 0;
                
        for (int i=1; i<=floor.getLength(); i++){
            elevator.add(floor.getEntry(i));
            count++;
            
        }
        
        floor.clear();
                
        return count;
       
    }
    
    static int moveoutPassengers(List<Passenger> floor, List<Passenger> elevator, int floorN){
        int count = 0;
        
        List<Integer> index = new List<>();
        
        for (int i=1; i<=elevator.getLength(); i++){
                        
            if(floorN == elevator.getEntry(i).getDestinationFloor()){
                floor.add(elevator.getEntry(i));
                count++;
                index.add(i);
            }
            
        }
        
        for  (int i=1; i<=index.getLength(); i++){
            elevator.remove(index.remove(i));
        }
        
        return count;
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Passenger> Elevator = new List<>();
        List<Passenger> Floor1 = new List<>();
        List<Passenger> Floor2 = new List<>();
        List<Passenger> Floor3 = new List<>();
        List<Passenger> Floor4 = new List<>();
        List<Passenger> Floor5 = new List<>();
        
        
        int passengerCount = 0;
        passengerCount += randomPassengers(Floor1, 1, passengerCount);
        passengerCount += randomPassengers(Floor2, 2, passengerCount);
        passengerCount += randomPassengers(Floor3, 3, passengerCount);
        passengerCount += randomPassengers(Floor4, 4, passengerCount);
        passengerCount += randomPassengers(Floor5, 5, passengerCount);
        
        
        
        int floorAmount=0;
        System.out.println("Building has 5 floors");
        System.out.println("========================");
        floorAmount = Floor1.getLength();
        System.out.println("Floor 1 (" + floorAmount + ") passengers waiting:");
        for (int j=1; j<=floorAmount; j++){
            PrintList(Floor1, j);
        }
        System.out.println("========================");
        floorAmount = Floor2.getLength();
        System.out.println("Floor 2 (" + floorAmount + ") passengers waiting:");
        for (int j=1; j<=floorAmount; j++){
            PrintList(Floor2, j);
        } 
        System.out.println("========================");
        floorAmount = Floor3.getLength();
        System.out.println("Floor 3 (" + floorAmount + ") passengers waiting:");
        for (int j=1; j<=floorAmount; j++){
            PrintList(Floor3, j);
        } 
        System.out.println("========================");
        floorAmount = Floor4.getLength();
        System.out.println("Floor 4 (" + floorAmount + ") passengers waiting:");
        for (int j=1; j<=floorAmount; j++){
            PrintList(Floor4, j);
        } 
        System.out.println("========================");
        floorAmount = Floor5.getLength();
        System.out.println("Floor 5 (" + floorAmount + ") passengers waiting:");
        for (int j=1; j<=floorAmount; j++){
            PrintList(Floor5, j);
        } 
        
       
        int pickedUp = 0;
        int served = 0;
        
        
        System.out.println("Elevator started");
        pickedUp = moveinPassengers(Floor1, Elevator, 1);
        served = moveoutPassengers(Floor1, Elevator, 1);
        System.out.println("At floor 1, elevator picked " + pickedUp + " passengers");
        System.out.println("Going up");
        System.out.println("========================");
        
        pickedUp = moveinPassengers(Floor2, Elevator, 2);
        served = moveoutPassengers(Floor2, Elevator, 2);
        if(floorAmount != 0){
            System.out.print("Stopped at floor 2, elevator picked " + pickedUp + " passengers");
            System.out.println(", # of passengers now " + Elevator.getLength());   
            System.out.println("Elevator served " + served + " passengers");
            System.out.println("Going up");
            System.out.println("========================"); 
        } else {
            System.out.println("========================");            
        }
        
        pickedUp = moveinPassengers(Floor3, Elevator, 3);
        served = moveoutPassengers(Floor3, Elevator, 3);
        if(floorAmount != 0){
            System.out.print("Stopped at floor 3, elevator picked " + pickedUp + " passengers");
            System.out.println(", # of passengers now " + Elevator.getLength()); 
            System.out.println("Elevator served " + served + " passengers");
            System.out.println("Going up");
            System.out.println("========================"); 
        } else {
            System.out.println("========================");            
        }
        
        pickedUp = moveinPassengers(Floor4, Elevator, 4);
        served = moveoutPassengers(Floor4, Elevator, 4);
        if(floorAmount != 0){
            System.out.print("Stopped at floor 4, elevator picked " + pickedUp + " passengers");
            System.out.println(", # of passengers now " + Elevator.getLength());
            System.out.println("Elevator served " + served + " passengers");
            System.out.println("Going up");
            System.out.println("========================"); 
        } else {
            System.out.println("========================");            
        }
        
        pickedUp = moveinPassengers(Floor5, Elevator, 5);
        served = moveoutPassengers(Floor5, Elevator, 5);
        System.out.print("Stopped at floor 5, elevator picked " + pickedUp + " passengers");
        System.out.println(", # of passengers now " + Elevator.getLength()); 
        System.out.println("Elevator served " + served + " passengers");
        System.out.println("Going down");
        System.out.println("========================");
        
        served = moveoutPassengers(Floor4, Elevator, 4);
        if(floorAmount != 0){
            System.out.print("Stopped at floor 4, elevator served " + served + " passengers");
            System.out.println(", # of passengers now " + Elevator.getLength());   
            System.out.println("Going down");
            System.out.println("========================"); 
        } else {
            System.out.println("========================");            
        }
        
        served = moveoutPassengers(Floor3, Elevator, 3);
        if(floorAmount != 0){
            System.out.print("Stopped at floor 3, elevator served " + served + " passengers");
            System.out.println(", # of passengers now " + Elevator.getLength());   
            System.out.println("Going down");
            System.out.println("========================"); 
        } else {
            System.out.println("========================");            
        }
        
        served = moveoutPassengers(Floor2, Elevator, 2);
        if(floorAmount != 0){
            System.out.print("Stopped at floor 2, elevator served " + served + " passengers");
            System.out.println(", # of passengers now " + Elevator.getLength()); 
            System.out.println("Going down");
            System.out.println("========================"); 
        } else {
            System.out.println("========================");            
        }
        
        served = moveoutPassengers(Floor1, Elevator, 1);
        System.out.print("Stopped at floor 1, elevator served " + served + " passengers");
        System.out.println(", # of passengers now " + Elevator.getLength());   
       
    }
    
}
