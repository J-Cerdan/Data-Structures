/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg920119665.hw06;

/**
 *
 * @author josep
 */
public interface StackInterface<T> {
    public void push(T entry);
    public T pop();
    public T peek();
    public boolean isEmpty();
}
