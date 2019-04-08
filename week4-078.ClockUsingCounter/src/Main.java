
import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        int i = 0;
        while ( i < 121 ) {
            System.out.println( hours + ":" + minutes);   // the current time printed
            // advance minutes
            // if minutes become zero, advance hours
            minutes.next();
            if(minutes.getValue() == 0){
            hours.next();
             
            }
            
            
            i++;
        }
    }
}
    




/* MY ANSWER

public class Main {
    public static void main(String[] args)  {
        Scanner reader = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.print("seconds: ");
        int s = Integer.parseInt(reader.nextLine());// read the initial value of seconds from the user

        
        System.out.print("miniutes: ");
        int m = Integer.parseInt(reader.nextLine());// read the initial value of seconds from the user

        
        System.out.print("hours: ");
        int h = Integer.parseInt(reader.nextLine());// read the initial value of seconds from the user

        

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        int i = 0;
        while ( i < 121 ) {
            // like in previous but seconds taken into account
            
            System.out.println( hours + ":" + minutes + ":" + seconds);   // the current time printed
            // advance minutes
            // if minutes become zero, advance hours
            seconds.next();
            
            if(seconds.getValue() ==0){        
            minutes.next();
                if(minutes.getValue() == 0){
                    hours.next();
            }   
                i++;
            }
            
            

        }
    }
}
   

*/

public class Main {
    public static void main(String[] args) throws Exception {
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        seconds.setValue(50);
        minutes.setValue(59);
        hours.setValue(23);

        while ( true ) {
            System.out.println( hours + ":" + minutes + ":" + seconds );
            Thread.sleep(1000);
            
            seconds.next();
            if(seconds.getValue() ==0){        
            minutes.next();
                if(minutes.getValue() == 0){
                    hours.next();
                }   
           
            }
            
        }
    }
}
    