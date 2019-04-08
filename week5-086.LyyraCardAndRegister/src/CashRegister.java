
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    private static final double ECONOMICAL =  2.50;
    private static final double GOURMET =  4.00;

    

    public CashRegister() {
        // at start the register has 1000 euros 
        cashInRegister = 1000;
        economicalSold = 0;
        gourmetSold = 0;
        
     
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens 
        
        
        /*
        if(cashGiven >= ECONOMICAL){
            economicalSold++;
            cashInRegister += ECONOMICAL;
            return cashGiven - ECONOMICAL;
        }
        else{
            return cashGiven;
        }
        */
        
        if(cashGiven < ECONOMICAL){   
            return cashGiven;
        }
        
        economicalSold++;
        cashInRegister += ECONOMICAL;
        return cashGiven - ECONOMICAL;
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
           if(cashGiven >= GOURMET){
            gourmetSold++;
            cashInRegister += GOURMET;
            return cashGiven - GOURMET;
        }
        else{
            return cashGiven;
        }
    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
    
    public boolean payEconomical(LyyraCard card) {
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        if(card.balance() >=ECONOMICAL){
            
            this.economicalSold++;
            card.pay(ECONOMICAL);
            return true;
        
        } else{
        
            return false;
        }
        
        
    }

    public boolean payGourmet(LyyraCard card) {
        // the price of the gourmet lunch is 4.00 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        
        if(card.balance() >=GOURMET){
            
            this.gourmetSold++;
            card.pay(GOURMET);
            return true;
        
        } else{      
            return false;
        }   
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum) {
        
        if(sum>=0){
        card.loadMoney(sum);
        cashInRegister +=sum;
        }
    }
}
