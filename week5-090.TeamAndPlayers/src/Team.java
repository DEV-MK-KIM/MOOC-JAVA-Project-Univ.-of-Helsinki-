
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mk
 */
public class Team {
    
    private String name;
    private ArrayList<Player> players;
    private int maxSize;
    
    
    //TEAM CONSTRUCTOR
    public Team (String teamName){
        
        this.name = teamName;
        this.players = new ArrayList<Player>();
        this.maxSize = 16;
    
    }
    
    public void addPlayer(Player player){
    
         if(this.players.size() < maxSize)
         this.players.add(player);
    
    } 
    
    public String getName(){
    
        return this.name;
    }
    
    
    
    public void printPlayers(){
        
//        
//        String membersAsString = "";
//        for ( Player player : this.players ) {
//            membersAsString += "  " + player.getName() + ", goals " +player.goals() +"\n";
//        }
//
//        System.out.println(membersAsString); 


        for (Player player : players){
        
            System.out.println(player);
        }
        
        
    }
    
    public void setMaxSize (int maxSize){
        
        
        this.maxSize = maxSize;
        
    
        //sets the maximum number of players that the team can have
        
        
//        int size = this.players.size();
//        int i = 1;
//           while(size > maxSize){
//             
//             this.players.remove(size - i);
//             i++;       
//         
//         }

    


    }
    
    public int size(){
        //    returns the number of players in the team 
        return this.players.size();

    
    }
    
    public int goals(){
    // returns the total number of goals for all the players in the team
    
        int totalGoals = 0;
        for( Player player : this.players){

            totalGoals += player.goals();

        }

            return totalGoals;

        }
    
    
    }
    
    

