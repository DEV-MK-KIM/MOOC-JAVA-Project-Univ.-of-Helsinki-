public class NumberStatistics {
    private int amountOfNumbers;
    private int total;
    

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        this.amountOfNumbers = 0;
        this.total = 0;
        
        
    }

    public void addNumber(int number) {
        // code here
        
        this.total += number;
        this.amountOfNumbers++;
   
    }

    public int amountOfNumbers() {
        // code here
        return this.amountOfNumbers;
    }
    
    public int sum() {
        // code here
        return this.total;
        
    }
   

    public double average() {
        // code here
        if(this.amountOfNumbers != 0){
        return (double)this.total / this.amountOfNumbers;
        }
        return 0;
    
    }
    
    
    
    
}