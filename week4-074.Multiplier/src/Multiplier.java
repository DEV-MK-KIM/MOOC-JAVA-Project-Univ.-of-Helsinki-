/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mk
 */
public class Multiplier {
    private int parameter;
    
    public Multiplier(int number){
    
       this.parameter = number;
       
    
    }
    
    public int multiply(int otherNumber){
    
    int result = otherNumber * this.parameter;
    return result;
    
    }
}
