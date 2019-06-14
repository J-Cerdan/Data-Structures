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
public class MainPart2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<User> arrRecord = new ArrayList<>();
        HashMap<String, Integer> hmap = new HashMap<String, Integer>();


        // TODO code application logic here
        for (String str : Data.users) {
            String[] temp = str.split(",");
            
            User user = new User(temp[0], temp[1], Integer.parseInt(temp[2]), temp[3], temp[4], temp[5], temp[6]);
            
            arrRecord.add(user);
        }    
        
        for (int i=0; i<arrRecord.size(); i++){
            int count = 0;
            if (hmap.containsKey(arrRecord.get(i).getState())){
                count = hmap.get(arrRecord.get(i).getState());
                count++;
                hmap.put(arrRecord.get(i).getState(), count);
            } else {
                hmap.put(arrRecord.get(i).getState(), 1);
                
            }
        }
                
        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String,Integer>>(hmap.entrySet());
        
        Collections.sort(list, new Comparator<Map.Entry<String,Integer>>(){
            @Override
            public int compare(Map.Entry<String,Integer> o1, Map.Entry<String,Integer> o2){
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        
        
        for (Map.Entry<String, Integer> item : list) {
		    System.out.println(item);
        }
        
        
        
        
    }
    
}
