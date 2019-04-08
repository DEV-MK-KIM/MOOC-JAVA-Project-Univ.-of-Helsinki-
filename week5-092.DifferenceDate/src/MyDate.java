public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public int differenceInYears(MyDate comparedDate){
    
        int differentYear =  this.year - comparedDate.year;
        int differentDay = (this.month*30 +this.day) - (comparedDate.month*30 +comparedDate.day);
        
        if(differentYear >= 0 && differentDay >=0 || differentYear <= 0 && differentDay <=0){
        
            differentYear = java.lang.Math.abs(differentYear);
        }
        else{
        
            differentYear = java.lang.Math.abs(differentYear)-1;
        }
        return differentYear;
        
        
        /* MOOC MODEL SOLUTION
        
        if (this.earlier(compared)) {
            return differenceWhenThisEarlier(compared);
        }
        
        int minusOneYear = 0;
        if (this.month < compared.month) {
            minusOneYear = 1; 
        } else if (this.month == compared.month && this.day < compared.day) {
            minusOneYear = 1; 
        }
 
        return this.year - compared.year - minusOneYear;
        
        */

    }

}
