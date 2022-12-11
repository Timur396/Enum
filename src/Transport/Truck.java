
package Transport;

public class Truck extends Transport implements Competing{
    private final Integer pitStopTime;
    private Weight weight;
    private final Integer maxSpeed;
    private final Integer bestLapTime;
    public Truck(String make,
                 String model,
                 double engineCapacity,
                 Integer pitStopTime,
                 Integer maxSpeed,
                 Integer bestLapTime,
                 Weight weight) {
        super(make, model, engineCapacity);
        this.bestLapTime = Validate.validateNumber(bestLapTime);
        this.pitStopTime = Validate.validateNumber(pitStopTime);
        this.maxSpeed = Validate.validateNumber(maxSpeed);
        this.weight=weight;
    }

    public Integer getPitStopTime() {
        return pitStopTime;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
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
    public void printType() {
        if (weight==null){
            System.out.println("Данных не достаточно");
        }else {
            String from=weight.getFrom()==null?"":" от "+weight.getFrom();
            String to=weight.getTo()==null?"":" от "+weight.getTo();
            System.out.println("Грузоподьемность от "+ from+ " до "+to);
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



