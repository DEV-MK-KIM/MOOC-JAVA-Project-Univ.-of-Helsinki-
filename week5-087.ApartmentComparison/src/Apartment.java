
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
    

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment){
    
//    My solution
//    if(this.squareMeters > otherApartment.squareMeters){   
//        return true;
//    }  
//    return false;
    
    return this.squareMeters > otherApartment.squareMeters;
    
    }
    
    
//    I have never thought about this method price() very useful to avoid redunduncy
    public int price(){
    
    return this.squareMeters * this.pricePerSquareMeter;
    }
    
    
    public int priceDifference(Apartment otherApartment){
  
    return java.lang.Math.abs(this.price() - otherApartment.price());
        
        
        
//    int priceThis = this.squareMeters * this.pricePerSquareMeter;
//    int priceOtherApartment = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
//    
//    return java.lang.Math.abs(priceThis - priceOtherApartment); // returns the absolute valuye
    
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment){
        
        
    return this.price() > otherApartment.price();
  

//    
//    if(priceThis>priceOtherApartment){
//    return true;
//    }
//    return false;
//    }
    }
    
}
