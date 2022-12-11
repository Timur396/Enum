package Drive;

import Transport.Bus;
import Transport.Transport;
//public class DriverD extends Driver<Bus> {
public class B extends  Driver<Bus>{
    public B(String name, boolean license, Integer experience, Bus car) {
        super(name, license, experience, car);
    }
    @Override
    String start() {
        return "Автобус автомобиль стартовал";
    }
    @Override
    String stop() {
        return "Автобус автомобиль остановился";
    }
    @Override
    String refuel() {
        return "Автобус автомобиль заправился";
    }
}
