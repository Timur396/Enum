package Drive;

import Transport.PassengerCar;
import Transport.Transport;

public class A extends  Driver<PassengerCar>{
    public A(String name, boolean license, Integer experience, PassengerCar car) {
        super(name, license, experience, car);
    }

    @Override
    String start() {
        return "Легковой автомобиль стартовал";
    }

    @Override
    String stop() {
        return "Легковой автомобиль остановился";
    }

    @Override
    String refuel() {
        return "Легковой автомобиль заправился";
    }

}
