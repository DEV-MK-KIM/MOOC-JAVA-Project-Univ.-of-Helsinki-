import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    
    private int passwordLength;
    private String randomPassword;
    Random random = new Random();

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.passwordLength = length;
        
        
    }

    public String createPassword() {
        // write code that returns a randomized password
        
        randomPassword ="";
        
        for(int j =0; j< passwordLength; j++){
        String letters = "abcdefghijklmnopqrstuvwxyz";
        int i =random.nextInt(letters.length());
        char symbol = letters.charAt(i);
        randomPassword += symbol;
        }
        
        return randomPassword;
    }
}

/* SOLUTION FROM MOOC

public class PasswordRandomizer {
    // Define the variables
    private Random random = new Random();
    private int length;
 
    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }
 
    public String createPassword() {
        // write code that returns a randomized password
        String characters = "abcdefghijklmnopqrstuvwxyz";
 
        String password = "";
        int numberOfCharacters = this.length;
        
        while (numberOfCharacters > 0) {
            int luku = this.random.nextInt(characters.length());
            char c = characters.charAt(luku);
            password = password + c;
            numberOfCharacters--;
        }
        
        return password;
    }
}
*/
