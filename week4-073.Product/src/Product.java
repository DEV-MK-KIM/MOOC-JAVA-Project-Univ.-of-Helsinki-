/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MK made this class
 */
public class Product {
    
    private String productName; // object Attributes
    private double price;
    private int amount;
    
    public Product(String nameAtStart, double priceAtStart, int amountAtStart){ //Constructor
        
        this.productName = nameAtStart;
        this.price = priceAtStart;
        this.amount = amountAtStart;
    }
    
    public void printProduct() {
        System.out.println(this.productName +", "+ this.price +", "+ this.amount); //Method
    }
 
    
}

