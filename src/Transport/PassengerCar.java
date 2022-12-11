
package Transport;

public class PassengerCar extends Transport implements Competing{
    private TypeOfBody typeOfBody;
    private final Integer pitStopTime;
    private final Integer maxSpeed;
    private final Integer bestLapTime;
    public PassengerCar(String make,
                        String model,
                        double engineCapacity,
                        Integer pitStopTime,
                        Integer maxSpeed,
                        Integer bestLapTime,
                        TypeOfBody typeOfBody) {
        super(make, model, engineCapacity);
        this.bestLapTime = Validate.validateNumber(bestLapTime);
        this.pitStopTime = Validate.validateNumber(pitStopTime);
        this.maxSpeed = Validate.validateNumber(maxSpeed);
        this.typeOfBody=typeOfBody;
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    @Override
    void startMove() {
        System.out.println( "Легковой автомобиль начал движение");

    }
    @Override
    void stopMove() {
        System.out.println("Легковой автомобиль закончил движение");
    }

    @Override
    public void printType() {
        if (typeOfBody==null){
            System.out.println("Данных не достаточно");
        }else {
            System.out.println("Тип кузова авто "+ typeOfBody);
        }
    }

    @Override
    public void getPitStop() {
        System.out.println(" Пит стоп:"+pitStopTime);
    }
    @Override
    public void getBestTime() {
        System.out.println(" Лучшее время" +bestLapTime);

    }
    @Override
    public void getMaxSpeed() {
        System.out.println(" Максимальная скорость"+ maxSpeed);

    }
}


