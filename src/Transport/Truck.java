
package Transport;

public class Truck extends Transport implements Competing{
    private final Integer pitStopTime;
    private final Integer maxSpeed;
    private final Integer bestLapTime;
    public Truck(String make, String model, double engineCapacity,
                 Integer pitStopTime,Integer maxSpeed,Integer bestLapTime) {
        super(make, model, engineCapacity);
        this.bestLapTime = Validate.validateNumber(bestLapTime);
        this.pitStopTime = Validate.validateNumber(pitStopTime);
        this.maxSpeed = Validate.validateNumber(maxSpeed);
    }
    @Override
    void startMove() {
        System.out.println(" Грузовик начал движение");
    }
    @Override
    void stopMove() {
        System.out.println(" Грузовик начал движение");
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



