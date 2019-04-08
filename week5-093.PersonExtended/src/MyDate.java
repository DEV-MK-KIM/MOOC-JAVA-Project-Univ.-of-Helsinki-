
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
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

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differneceInYears(MyDate compared) {
        int differentYear =  this.year - compared.year;
        int differentDay = (this.month*30 +this.day) - (compared.month*30 +compared.day);
        
        if(differentYear >= 0 && differentDay >=0 || differentYear <= 0 && differentDay <=0){
        
            differentYear = java.lang.Math.abs(differentYear);
        }
        else{
        
            differentYear = java.lang.Math.abs(differentYear)-1;
        }
        return differentYear;
    }

  
}
