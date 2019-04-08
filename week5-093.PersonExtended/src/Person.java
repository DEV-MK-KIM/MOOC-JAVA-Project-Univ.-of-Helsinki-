import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    private int date = Calendar.getInstance().get(Calendar.DATE);
    private int month = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
    private int year = Calendar.getInstance().get(Calendar.YEAR);
    
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public Person(String name, MyDate birthday){
        
        this.name = name;
        this.birthday = birthday;
 
    
    } 
    //constructor sets the given MyDate-object to be the birthday of the person
    public Person(String name){
        
        this.name = name;
        this.birthday = new MyDate(date, month, year);


    } 
    //constructor sets the current date (i.e., the date when the program is run) to be the birthday of the person
    
    
    public int age() {
        // calculate the age based on the birthday and the current day
        // you get the current day as follows: 
        
        

       MyDate today = new MyDate(date, month, year);
       
        
       int age = birthday.differneceInYears(today);
       
       return age;

      
    }
    
    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays
       
        return this.birthday.earlier(compared.birthday);
        
        /*
        
        if(this.birthday.earlier(compared.birthday) == true){
        
            return true;
        
        }
        return false;
        */
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
