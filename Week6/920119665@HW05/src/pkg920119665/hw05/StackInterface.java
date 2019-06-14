/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg920119665.hw05;

/**
 *
 * @author josep
 */
public interface StackInterface<T> {
    public void pushA(T entry);
    public T popA();
    public T peekA();
    public void pushB(T entry);
    public T popB();
    public T peekB();
    public boolean isEmptyA();
    public boolean isEmptyB();
}
