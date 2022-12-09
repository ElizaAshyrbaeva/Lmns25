import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        var cars = new HashMap<Car, carInfo>();
        cars.put(new Car(12, "OA678"),
                new carInfo(LocalDate.of(2000, 6, 5), "Audi", BigDecimal.valueOf(200000), "Black"));
        cars.put(new Car(13, "OA778"),
                new carInfo(LocalDate.of(2021, 1, 2), "Camry", BigDecimal.valueOf(400000), "Black"));
        cars.put(new Car(14, "OA445"),
                new carInfo(LocalDate.of(2000, 7, 31), "Lexus 470", BigDecimal.valueOf(500000), "Blue"));
        cars.put(new Car(15, "OA4578"),
                new carInfo(LocalDate.of(2014, 9, 30), "Bugatti ", BigDecimal.valueOf(100000), "White"));
        Iterator<Map.Entry<Car, carInfo>> iterator = cars.entrySet().iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}