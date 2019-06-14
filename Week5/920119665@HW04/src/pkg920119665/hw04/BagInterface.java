/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg920119665.hw04;

/**
 *
 * @author josep
 */
public interface BagInterface <T>{
    public int getCurrentSize();
    public boolean isFull();
    public boolean isEmpty();
    public boolean add(T newEntry);
    public T remove();
    public boolean remove(T anEntry);
    public void clear();
    public int getFrequencyOf(T anEntry);
    public boolean contains(T anEntry);
    public int getMin();
    public int getMax();
    public T[] toArray();
    
}
