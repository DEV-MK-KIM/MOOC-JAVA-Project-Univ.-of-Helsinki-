public class Reformatory {
    
    private int weightCount;
    
    public Reformatory(){
        this.weightCount = 0;
    }

    
    public int weight(Person person) {
     
     this.weightCount++;
        // return the weight of the person
     return person.getWeight();
 
    }
 
    public void feed(Person person) {
    
        int newWeight = person.getWeight();
        newWeight++;
        person.setWeight(newWeight); 
// forget to set the weight.... if you don't set, you get the same results
    }
    
    
    
    public int totalWeightsMeasured(){
        
     
        return this.weightCount;
    
    }

}


/* MOOC MODEL SOLUTION

public class Reformatory {
    private int weightsMeasured;
 
    public Reformatory() {
        this.weightsMeasured = 0;
    }
 
    public int weight(Person person) {
        // return the weight of the person
        this.weightsMeasured++;
        return person.getWeight();
    }
 
    public void feed(Person person) {
        int weightBeforeEating = person.getWeight();
        person.setWeight(weightBeforeEating + 1);
    } 
 
    public int totalWeightsMeasured() {        
        return weightsMeasured;
    }
}



*/