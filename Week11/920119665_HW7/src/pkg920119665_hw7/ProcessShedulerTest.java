/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg920119665_hw7;

import java.util.*;

/**
 *
 * @author josep
 */
public class ProcessShedulerTest {
    
    static Process GenerateProcesses(int i){
        int rand = (int) (Math.random()*100);
        int id = i+1;
        Process p = new Process(id, rand);
        System.out.print("Currently adding process ID:" + id);
        System.out.println(" with priority " + rand);
        
        return p;
    }
    
    static void ServerProcesses(Process p){
        System.out.print("Currently processing process ID:" + p.getID());
        System.out.println(" with priority " + p.getPriority());
    }
    
    
    public static void main(String[] args) {
        PriorityQueue<Process> integerPriorityQueue = new PriorityQueue(10);
        
        for (int i=0; i<10; i++){
            integerPriorityQueue.add(GenerateProcesses(i));
        }
        
        for(Process p:integerPriorityQueue){  
            ServerProcesses(p);  
        }  
        
    }
    
    
}


