package Drive;

import Transport.Transport;
import Transport.Truck;

public class C extends  Driver<Truck>{
    public C(String name, boolean license, Integer experience, Truck car) {
        super(name, license, experience, car);
    }

    @Override
    String start() {
        return "Грузовой автомобиль стартовал";
    }

    @Override
    String stop() {
        return "Грузовой автомобиль остановился";
    }

    @Override
    String refuel() {
        return "Грузовой автомобиль заправился";
    }

}
