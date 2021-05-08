public class CarInfo extends Ferrari{
    private String color;
    public CarInfo(){
        super();
        this.color = "";
    }

    public CarInfo(String model, int year, String brand, String color){
        super(brand, year, model);
        this.color = color;
    }
    public String toString(){
        return "Color: " + this.color + ", " + super.toString();
    }
    public boolean equals(CarInfo car1){
        if (super.equals(car1) && car1.color == this.color){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isTrueFerrari(){
        if (this.color == "red" || this.color == "Red"){
            return true;
        }
        else{
            return false;
        }
    }

    public String firstGlance(){
        if (this.color == "red" || this.color == "Red"){
            return "Most people will see this as a Ferrari";
        }
        else{
            return "people will see this car as a lamborghini";
        }
    }

}
