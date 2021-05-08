import java.util.ArrayList;
import java.util.Collections;
;public class Tester {
    public static void main(String[] args) {
        ArrayList<Cars> listOfCars = new ArrayList<Cars>();
        Cars car1 = new Cars("Audi", 1999);
        Cars car2 = new Cars("Honda", 2003);
        Cars car3 = new Cars("Ford", 1986);
        Ferrari car4 = new Ferrari("512", 1969, "Ferrari");
        Ferrari car5 = new Ferrari("488", 2016, "Ferrari");
        Ferrari car6 = new Ferrari("F40", 1988, "Ferrari");
        CarInfo car7 = new CarInfo("512", 1969, "Ferrari", "red");
        CarInfo car8 = new CarInfo("488", 2016, "Ferrari", "yellow");
        CarInfo car9 = new CarInfo("F50", 1990, "Ferrari", "Red");
        CarInfo car10 = car9;
        Collections.addAll(listOfCars, car1, car2, car3, car4, car5, car6, car7, car8, car9, car10);
        
    }
}
