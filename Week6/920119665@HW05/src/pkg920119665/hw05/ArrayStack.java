/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg920119665.hw05;

import java.util.Arrays;

/**
 *
 * @author josep
 */
public class ArrayStack<T> implements StackInterface<T>{
    private T[] stack; // array of stack entries
    private int topIndexA; // index of top entry of stack A
    private int topIndexB; // index of top entry of stack B
    private static final int DEFAULT_INITIAL_CAPACITY = 50;

    public ArrayStack() {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public ArrayStack(int initialCapacity) {
        // the cast is safe because the new array contains null entries
        @SuppressWarnings("unchecked")
        T[] tempStack = (T[]) new Object[initialCapacity];
        stack = tempStack;
        topIndexA = -1; //Start at -1, if equals to 0 it means that there is an element in the array.
        topIndexB = DEFAULT_INITIAL_CAPACITY;
    }

    @Override
    public void pushA(T entry) {
        topIndexA++;
        stack[topIndexA] = entry;
         
    }
    
    @Override
    public void pushB(T entry) {
        topIndexB--;
        stack[topIndexB] = entry;
    }

    @Override
    public T popA() {
        T top = null;
        if (!isEmptyA()) {
            top = stack[topIndexA];
            stack[topIndexA] = null;
            topIndexA--;
        } // end if
        return top;
    }
    
    @Override
    public T popB() {
        T top = null;
        if (!isEmptyB()) {
            top = stack[topIndexB];
            stack[topIndexB] = null;
            topIndexB++;
        } // end if
        return top;
    }

    @Override
    public T peekA() {
        T top = null;
        if (!isEmptyA()) {
            top = stack[topIndexA];
        }
        return top;
    }
    
    @Override
    public T peekB() {
        T top = null;
        if (!isEmptyB()) {
            top = stack[topIndexB];
        }
        return top;
    }

    @Override
    public boolean isEmptyA() {
        return topIndexA < 0;
    }
    
    @Override
    public boolean isEmptyB() {
        return topIndexB >= DEFAULT_INITIAL_CAPACITY;
    }
}
