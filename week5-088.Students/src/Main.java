
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        ArrayList<Student> list = new ArrayList<Student>();
        
        //ADD STUDENT PROFILES INTO ARRAY
        while(true){
            System.out.print("type your name: ");
            String studentName = reader.nextLine(); 

            if(studentName.equals("")) // if(studentName.isEmpty())
            break;

            System.out.print("type your student number: ");
            String studentNumber = reader.nextLine();

            list.add(new Student(studentName, studentNumber));
        

        }
        //PRINT OUT ALL STUDENTS IN THE LIST
        System.out.println();
        for(Student student : list){
        
        System.out.println(student);

        
        }
        //SEARCH
        System.out.println();
        System.out.print("Give search term: ");
        String keyword = reader.nextLine();
        System.out.println("Result: ");
        
        for(Student student : list){
        
            if(student.getName().contains(keyword)){
            
                System.out.println(student);
            }

        }
        
        
}
    
    
}
