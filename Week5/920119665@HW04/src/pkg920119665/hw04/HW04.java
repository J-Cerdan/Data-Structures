/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg920119665.hw04;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author josep
 */
public class HW04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        NodeBasedBag<Integer> coinbag = new NodeBasedBag<>();
        int choice = 0;
        
        do{
            System.out.println("[1] Adding a coin");
            System.out.println("[2] Removing a coin");
            System.out.println("[3] Removing a specific coin");
            System.out.println("[4] Clear the bag");
            System.out.println("[5] Get the frequency of a given coin");
            System.out.println("[6] Check if specific coin exists in the bag");
            System.out.println("[7] Get minimum coin value");
            System.out.println("[8] Get maximum coin value");
            System.out.println("[9] Print coin bag contents");
            System.out.println("[10] Print coin bag contents ordered");
            System.out.println("[11] Exit");
            System.out.println("Enter your choice:");
            
            Scanner in = new Scanner(System.in);
            choice = in.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Enter coin value (10/25/75/100):");
                    
                    int coinValue = in.nextInt();
                    
                    while (coinValue != 10 && coinValue != 25 && coinValue != 75 && coinValue != 100) {
                        System.out.println("Coin value not valid, Enter again. (10/25/75/100): ");
                        coinValue = in.nextInt();
                    }
                    
                    if (coinbag.add(coinValue)) {
                        System.out.println(coinValue + " cents has been successfully added to the coin bag");
                    }
                    break;

                case 2:
                    if (coinbag.isEmpty()) {
                        System.out.println("Coin bag is empty!");
                    } else {
                        System.out.println(coinbag.remove() + " cents has been removed successfully");
                    }
                    break;
                case 3:
                    System.out.println("Enter the coin you want to remove from the coin bag (10/25/75/100):");
                    coinValue = in.nextInt();
                    if (coinbag.contains(coinValue)) {
                        coinbag.remove(coinValue);
                        System.out.println(coinValue + " cents has been removed from the bag");
                    } else {
                        System.out.println(coinValue + " cents doesnt exist in the bag");
                    }
                    break;
                case 4:
                    coinbag.clear();
                    System.out.println("Coin bag is empty now!");
                    break;
                case 5:
                    System.out.println("Enter the coin you are looking for:");
                    coinValue = in.nextInt();
                    System.out.println(coinValue + " cents is found " + coinbag.getFrequencyOf(coinValue) + " times");
                    break;
                case 6:
                    System.out.println("Enter the coin you are looking for:");
                    coinValue = in.nextInt();
                    if (coinbag.contains(coinValue)) {
                        System.out.println(coinValue + " cents is in the coin bag");
                    } else {
                        System.out.println(coinValue + " cents is NOT in the coin bag");
                    }
                    break;
                case 7:
                    if (coinbag.isEmpty()) {
                        System.out.println("Coin bag is empty!");
                    } else {
                        System.out.println("Minimum coin in bag: " + coinbag.getMin() + " cents");
                    }
                    break;
                case 8:
                    if (coinbag.isEmpty()) {
                        System.out.println("Coin bag is empty!");
                    } else {
                        System.out.println("Maximum coin in bag: " + coinbag.getMax() + " cents");
                    }
                    break;
                case 9:
                    if (coinbag.isEmpty()) {
                        System.out.println("Coin bag is empty!");
                    } else {
                        System.out.println("Coin bag content:");
                        System.out.println(Arrays.toString(coinbag.toArray()));
                    }
                    break;
                case 10:
                    if (coinbag.isEmpty()) {
                        System.out.println("Coin bag is empty!");
                    } else {
                        System.out.println("Coin bag content in order:");
                        Object [] coinArray = coinbag.toArray();
                        Arrays.sort(coinArray);
                        System.out.println(Arrays.toString(coinArray));
                    }
                    break;
                case 11:
                    System.out.println("GoodBye!");
                    break;
                default:
                    System.out.println("Invalid choice! Enter a number in the range [1-11]");
                    break;
            }
        } while (choice != 11);

        
    }
    
}
