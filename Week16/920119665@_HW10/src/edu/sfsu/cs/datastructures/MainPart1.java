package edu.sfsu.cs.datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainPart1 {
    /*
    * Question 1:
    * - In this question you will use the Data.users array that includes
    * a list of users. Formatted as : firstname,lastname,age,email,gender,city,state
    * - Create a User class that should parse all the parameters for each user.
    * - Insert each of the users in a list.
    * - Print out the TOP 10 oldest users.
    * */

    public static void main(String[] args) {
        ArrayList<User> arrRecord = new ArrayList<>();


        //example on how to access the Data.users array.
        for (String str : Data.users) {
            System.out.println(str);
        }
        
        for (String str : Data.users) {
            String[] temp = str.split(",");
            
            User user = new User(temp[0], temp[1], Integer.parseInt(temp[2]), temp[3], temp[4], temp[5], temp[6]);
            
            arrRecord.add(user);
        }
        
        Collections.sort(arrRecord, new Comparator<User>(){
            public int compare(User u1, User u2){
                return Integer.valueOf(u2.getAge()).compareTo(u1.getAge());
            }
        });
        
        System.out.println("Top 10 Oldest Users:");
        
        for (int i=0; i<10; i++){
            User user = arrRecord.get(i);
            System.out.println("Firstname: " + user.getFirstname()
                    + " Lastname: " + user.getLastname()
                    + " Age: " + user.getAge()
                    + " Email: " + user.getEmail()
                    + " Gender: " + user.getGender()
                    + " City: " + user.getCity()
                    + " State: " + user.getState());
        }
    }
}