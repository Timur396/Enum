import Transport.Transport;
import Transport.Truck;
import Transport.Weight;

public class Main {
    public static void main(String[] args) {

        Truck kamaz=new Truck("Камаз","5490",12, Weight.N2);
service(kamaz);
    }

    private static void service(Transport... transports) {
        for (int i = 0; i <transports.length ; i++) {
            if(!transports[i].service()){
                throw new RuntimeException("Автомобиль "+ transports[i].getMake()+transports[i].getModel()+" не прошел диагностику");
            }
        }

    }
}


