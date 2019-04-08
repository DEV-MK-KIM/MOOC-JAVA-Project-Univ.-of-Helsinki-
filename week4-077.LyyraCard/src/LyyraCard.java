/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mk
 */
public class LyyraCard {
    private double balance;
    private final double ECONOMICAL = 2.5;
    private final double GOURMET = 4.0;
    private final double MAXBALANCE = 150.00;

    
    public LyyraCard(double balanceAtStart) {
        // write code here
        this.balance = balanceAtStart;
        
    }

    
    public String toString() {
        // write code here
        return "The card has " + this.balance + " euros";
    }
    
    public void payEconomical() {
    // write code here
    if(this.balance >= ECONOMICAL){
    this.balance -= ECONOMICAL;}
}

    public void payGourmet() {
    // write code here
    if(this.balance >= GOURMET){
    this.balance -= GOURMET;}
}
    public void loadMoney(double amount) {
    // write code here
    
    if(amount>=0){
        if(amount+this.balance <= MAXBALANCE)
        this.balance += amount;

        else{
        this.balance = MAXBALANCE;}
    }
    
    
}
    
    
}