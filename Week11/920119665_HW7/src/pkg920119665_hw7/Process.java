/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg920119665_hw7;


/**
 *
 * @author josep
 */
public class Process implements Comparable<Process>{
    private int ID;
    private int Priority;

    public Process() {
        this.ID = this.Priority = 0;
    }

    public Process(int ID, int Priority) {
        this.ID = ID;
        this.Priority = Priority;
    }
    
   
    @Override
    public int compareTo(Process p){
        if(Priority < p.getPriority()){  
            return 1;  
        }else if(Priority > p.getPriority()){  
            return -1;  
        }else{  
            return 0;  
        }
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPriority() {
        return Priority;
    }

    public void setPriority(int Priority) {
        this.Priority = Priority;
    }
     
    
}
