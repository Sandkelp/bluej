public class Cars{
    private String brand;

    private int year;

    public Cars(){
        this.brand = "";
        this.year = 0;
    }

    public Cars(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    public String toString(){
        return "Make: " + this.brand + ", Year: " + this.year;
    }

    public boolean equals(Cars car1){
        if (car1.toString().equals(this.toString()) && car1.year == this.year){
            return true;
        }
        else
            return false;
    }

    public boolean isNew(){
        if (this.year > 2010){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isClassic(){
        if (this.year < 1985){
            return true;
        }
        else{
            return false;
        }
    }

    public int getYear(){
        return this.year;
    }

}