
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // add here code that tests LyraCard. However before doing 77.6 remove the
        // other code 

        
        
        //Creates a LyyraCard for Pekka with initial balance of 20 euros
        
        LyyraCard Pekka = new LyyraCard(20);
        
        //Creates a LyyraCard for Brian with initial balance of 30 euros
        
         LyyraCard Brian = new LyyraCard(30);
        
        //Pekka buys gourmet lunch
        
        Pekka.payGourmet();
        
        //Brian buys economical lunch
        
        Brian.payEconomical();
        //cards are printed (both on their own row, starting with the name of the card owner)
        
        System.out.println("Pekka: "+Pekka);
        System.out.println("Brian: "+Brian);
        
        //Pekka loads 20 euros
        
        Pekka.loadMoney(20);
        //Brian buys gourmet lunch
        Brian.payGourmet();
        //cards are printed (both on their own row, starting with the name of the card owner)
           
        System.out.println("Pekka: "+Pekka);
        System.out.println("Brian: "+Brian);
        
        //Pekka buys economical lunch
        
        Pekka.payEconomical();
        //Pekka buys economical lunch
        Pekka.payEconomical();
        //Brian loads 50 euros
        Brian.loadMoney(50);
        //cards are printed (both on their own row, starting with the name of the card owner)
        System.out.println("Pekka: "+Pekka);
        System.out.println("Brian: "+Brian);
        
       
    }
}
