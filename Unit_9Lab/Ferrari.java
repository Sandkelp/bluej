public class Ferrari extends Cars{
    private String model;

    public Ferrari(){
        super();
        this.model = "";
    }

    public Ferrari(String model, int year, String brand){
        super(brand, year);
        this.model = model;
    }
    public String toString(){
        return super.toString() + ", Model: " + this.model ;
    }

    public boolean equals(Ferrari car1){
        if (super.equals(car1) && car1.model == this.model){
            
           return true;

        }
        else {
            return false;
        }
            
    }
    public boolean isClassic(){
        if (this.getYear() < 1975 && this.model == "F40"){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean madeByEnzoFerrari(){
        if (this.getYear() <= 1988){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean bruhIDK(){
        if (this.model == "488"){
            return true;
        }
        else{
            return false;
        }
    }
}
        


