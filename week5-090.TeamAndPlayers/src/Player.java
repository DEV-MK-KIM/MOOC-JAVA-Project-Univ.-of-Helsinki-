/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mk
 */
public class Player {
    
    private String name;
    private int goals;
    
    
    public Player (String playerName){

//        Redundancy        
//        this.name = playerName;
//        this.goals = 0;

        this(playerName, 0);
    
    }
    
    public Player (String playerName, int goals){
        
        this.name = playerName;
        this.goals = goals;

    }
    
    public String getName(){
    
        return this.name;
    
    }
    
    public int goals(){
    
        return this.goals;
    }
    
    @Override
    public String toString(){
    
        return this.name + ", goals "+this.goals();
    
    }
    
}
