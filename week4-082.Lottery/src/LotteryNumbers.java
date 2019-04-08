import java.util.ArrayList;
import java.util.Random;

/*
the constructor LotteryNumbers creates a new LotteryNumbers object, which contains the new drawn numbers
the method numbers returns the drawn numbers of this draw
the method drawNumbers draws new numbers
the method containsNumber reveals if the number is among the drawn numbers
*/

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private final int COMBINATIONNUMBERS = 7;
    private final int LOTTOMAXNUMBER = 39;


    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the number

        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        Random random = new Random();
        
        int counter =0;
        while(counter < COMBINATIONNUMBERS){
            
        int drawnNumber = random.nextInt(LOTTOMAXNUMBER) + 1;
            if(!this.containsNumber(drawnNumber)){ //IF NOT DUPLICATE
            this.numbers.add(drawnNumber);
            counter++;
            }
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if(this.numbers.contains(number)){
        return true; // TRUE IF DUPLICATE
        }
    return false; // FALSE IF NOT
    }
}


/* mooc SOLUTION

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
 
    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }
 
    public ArrayList<Integer> numbers() {
        return this.numbers;
    }
 
    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        Random random = new Random();
        while (this.numbers.size() < 7) {
            int newNumber = random.nextInt(39) + 1;
            boolean alreadyDrawn = this.containsNumber(newNumber);
 
            // we add the number only if it is not already among the drawn numbers
            if (!alreadyDrawn) {
                this.numbers.add(newNumber);
            }
        }
    }
 
    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        for (int n : this.numbers) {
            if (n == number) {
                return true;
            }
        }
        return false;
    }
}


*/