import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Car,Carr> map = new HashMap<>();
        map.put(new Car(12345,"LK0399W"),new Carr(1999,"Toyota Camry",85000,"Bleak"));
        for (Map.Entry<Car, Carr> carCarrEntry : map.entrySet()) {
            System.out.println(carCarrEntry.getKey()+" -> "+carCarrEntry.getValue());
        }

    }
}