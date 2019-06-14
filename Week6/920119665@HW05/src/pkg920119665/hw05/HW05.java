/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg920119665.hw05;

import java.util.Scanner;

/**
 *
 * @author josep
 */
public class HW05 {
    static void printStackA(ArrayStack s) {
        ArrayStack<Integer> temp = new ArrayStack<>();
        System.out.println("Stack contents:");
        while (!s.isEmptyA()) {
            int t = (Integer)s.popA();
            temp.pushA(t);
            System.out.print(t + " ");
        }
        System.out.println();
         
        while(!temp.isEmptyA())
            s.pushA(temp.popA());
    }
    
    static void printStackB(ArrayStack s) {
        ArrayStack<Integer> temp = new ArrayStack<>();
        System.out.println("Stack contents:");
        while (!s.isEmptyB()) {
            int t = (Integer)s.popB();
            temp.pushB(t);
            System.out.print(t + " ");
        }
        System.out.println();
         
        while(!temp.isEmptyB())
            s.pushB(temp.popB());
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayStack<Integer> stack = new ArrayStack<>();
        
        int choice = -1;

        do {
            System.out.println("[1] Push into first stack");
            System.out.println("[2] Push into second stack");
            System.out.println("[3] Pop from first stack");
            System.out.println("[4] Pop from second stack");
            System.out.println("[5] Print top of first stack");
            System.out.println("[6] Print top of second stack");
            System.out.println("[7] Print contents of first stack");
            System.out.println("[8] Print contents of second stack");
            System.out.println("[9] To Exit");
            System.out.println("Enter your choice:");
            Scanner in = new Scanner(System.in);
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter an item: ");
                    int num = in.nextInt();
                    stack.pushA(num);
                    break;
                case 2:
                    System.out.println("Enter an item: ");
                    num = in.nextInt();
                    stack.pushB(num);
                    break;
                case 3:
                    if (!stack.isEmptyA()) {
                        System.out.println(stack.popA() + " has been removed from stack A");
                    }
                    break;
                case 4:
                    if (!stack.isEmptyB()) {
                        System.out.println(stack.popB() + " has been removed from stack B");
                    }
                    break;
                case 5:
                    if(!stack.isEmptyA())
                    System.out.println("Top of stack A is " + stack.peekA());
                    else
                        System.out.println("Stack A is empty");
                    break;
                case 6:
                    if(!stack.isEmptyB())
                    System.out.println("Top of stack B is " + stack.peekB());
                    else
                        System.out.println("Stack B is empty");
                    break;
                case 7:
                    if (stack.isEmptyA()) {
                        System.out.println("Stack A is empty");
                    } else {
                        printStackA(stack);
                    }
                    break;
                case 8:
                    if (stack.isEmptyB()) {
                        System.out.println("Stack B is empty");
                    } else {
                        printStackB(stack);
                    }
                    break;
                case 9:
                    System.out.println("GoodBye!");
                    break;
                default:
                    System.out.println("Invalid choice! Enter a number in the range [1-9]");
                    break;
            }
        } while (choice != 9);
    
    }
    
}
