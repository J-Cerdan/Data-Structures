/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sfsu.cs.datastructures;

import java.util.*;

/**
 *
 * @author josep
 */
public class MainPart3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Set<User> set = new HashSet<>();
        Set<User> otherSet = new HashSet<>();

        // TODO code application logic here
        for (String str : Data.users) {
            String[] temp = str.split(",");
            
            User user = new User(temp[0], temp[1], Integer.parseInt(temp[2]), temp[3], temp[4], temp[5], temp[6]);
            
            set.add(user);
        }
        
        for (String str : Data.otherUsers) {
            String[] temp = str.split(",");
            
            User user = new User(temp[0], temp[1], Integer.parseInt(temp[2]), temp[3], temp[4], temp[5], temp[6]);
            
            otherSet.add(user);
        }
        
        set.retainAll(otherSet);
                
        List<User> sortedList = new ArrayList<>(set);
        
        Collections.sort(sortedList);
        Collections.reverse(sortedList);
        
       
        for (int i = 1; i < sortedList.size(); i++) {
            System.out.println(sortedList.get(i).toString() + " ");
        }
        System.out.println();        
        
    }
    
}
