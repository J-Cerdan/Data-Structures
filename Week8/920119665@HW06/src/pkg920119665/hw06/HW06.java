/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg920119665.hw06;

import java.util.Scanner;

/**
 *
 * @author josep
 */
public class HW06 {
    
    static void printStack(NodeStack s) {
        NodeStack<Character> backup = new NodeStack<>();
        System.out.println("Stack contents:");
        
        while (!s.isEmpty()) {
            char t = (Character)s.pop();
            backup.push(t);
            System.out.print(t + " ");
        }
        System.out.println();
         
        while(!backup.isEmpty())
            s.push(backup.pop());
        
    }
    
    static void printSameOrder(NodeStack s) {
        NodeStack<Character> backup = new NodeStack<>();
        System.out.println("Stack contents (In order of input): ");
        
        while (!s.isEmpty()) 
            backup.push((Character)s.pop());
         
        while(!backup.isEmpty()){
            
            char t = backup.pop();
            s.push(t);
            System.out.print(t + " ");
        }
        System.out.println();
    }
    
    static boolean isPalindrome(NodeStack s){
        NodeStack<Character> backup = new NodeStack<>();
        NodeStack<Character> compare1 = new NodeStack<>();
        NodeStack<Character> compare2 = new NodeStack<>();
        
        while (!s.isEmpty()){
            char t = (Character)s.pop();
            compare1.push(t);
            backup.push(t);
        }
        
        while(!backup.isEmpty()){
            char t = backup.pop();
            compare2.push(t);
            s.push(t);
        }
        
        while(!compare1.isEmpty() && !compare2.isEmpty())
            if (!compare1.pop().equals(compare2.pop()))
                return false;
            
        
        return true;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int choice = -1;
        NodeStack<Character> stk = new NodeStack<>();
        do {
            System.out.println("[1] To push an item into the stack");
            System.out.println("[2] To pop an item from the stack");
            System.out.println("[3] To print the top of stack");
            System.out.println("[4] To check of stack is empty");
            System.out.println("[5] To print bag contents");
            System.out.println("[6] To print bag contents in input order");
            System.out.println("[7] To check if stack is a palindrome");
            System.out.println("[8] To Exit");
            System.out.println("Enter your choice:");
            Scanner in = new Scanner(System.in);
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter an item");
                    char num = in.next().charAt(0);
                    stk.push(num);
                    break;
                case 2:
                    if (!stk.isEmpty()) {
                        stk.pop();
                    }
                    break;
                case 3:
                    if (!stk.isEmpty()) {
                        System.out.println("Top of the stack is " + stk.peek());
                    } else {
                        System.out.println("Stack is empy ");
                    }
                    break;
                case 4:
                    if (stk.isEmpty()) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Stack is not empty");
                    }
                    break;
                case 5:
                    printStack(stk);
                    break;
                case 6:
                    printSameOrder(stk);
                    break;
                case 7:
                    if (!stk.isEmpty() && isPalindrome(stk)){
                        System.out.println("Stack is a palindrome");
                    } else {
                        System.out.println("Stack is not a palindrome");
                    }
                    break;
                case 8:
                    System.out.println("GoodBye!");
                    break;
                default:
                    System.out.println("Invalid choice! Enter a number in the range [1-8]");
                    break;
            }
        } while (choice != 8);
    }
    
    
}
