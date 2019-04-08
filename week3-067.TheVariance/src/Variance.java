import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63  
    public static int sum(ArrayList<Integer> list) {
        
        int total = 0;
        for(int number : list){
        total +=number;
        }
        
        return total;
        
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
       
        double average = (double)(sum(list) / list.size());
        return average;
        
    }
        
    public static double variance(ArrayList<Integer> list) {
        // write code here
        
        double variance = 0;
        double average = average(list);
        
        for(int num : list){
            
         variance += Math.pow((num- (double)average),2);
         
        }
        return (double)variance / (list.size() -1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
