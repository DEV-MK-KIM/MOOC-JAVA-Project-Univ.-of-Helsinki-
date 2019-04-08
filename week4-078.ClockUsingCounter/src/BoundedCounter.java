/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mk made this class BoundedCounter
 */
public class BoundedCounter {
    private int upperLimit;
    private final int STARTVALUE = 0;
    private int value = STARTVALUE;


    public BoundedCounter(int upperLimit) {
        
        // write code here
        this.upperLimit = upperLimit;
        this.value = 0;
    }

    public void next() {
        // write code here
           
      
        this.value ++;
        if(this.value > this.upperLimit){
        this.value = STARTVALUE;}
        
    }

    public String toString() {
        // write code here
        if(this.value < 10){
        return "0"+ this.value;
        }
        return ""+this.value;
    }
    
   public int getValue(){
       
    return this.value;
       
   }
   
   public void setValue(int time){
   if(time > 0)
   this.value = time;
   if(time > this.upperLimit)
   this.value = 0;
   
       
   }
    
   
}


/* SOLUTION

public class BoundedCounter {
 
    private int value;
    private int limit;
 
    public BoundedCounter(int limit) {
        this.limit = limit;
        this.value = 0;
    }
 
    public void next() {
        if (this.value == this.limit) {
            this.value = 0;
        } else {
            this.value++;
        }
    }
 
    public int getValue() {
        return this.value;
    }
 
    public void setValue(int value) {
        if (value < 0 || value > this.limit) {
            return;
        }
 
        this.value = value;
    }
 
    @Override
    public String toString() {
        String initialZero = "0";
        if (this.value > 9) {
            initialZero = "";
        }
        return initialZero + this.value;
    }
}
*/