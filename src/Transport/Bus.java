package Transport;

import Drive.C;

public  class Bus extends Transport implements Competing {
    private final Integer pitStopTime;
    private Capacity capacity;
    private final Integer maxSpeed;
    private final Integer bestLapTime;

    public Bus(String make,
               String model,
               double engineCapacity,
               Integer pitStopTime,
               Integer maxSpeed,
               Integer bestLapTime,
               Capacity capacity) {
        super(make, model, engineCapacity);
        this.bestLapTime = Validate.validateNumber(bestLapTime);
        this.pitStopTime = Validate.validateNumber(pitStopTime);
        this.maxSpeed = Validate.validateNumber(maxSpeed);
   this.capacity=capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
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
    @Override
    void startMove() {
        System.out.println(" автобус начал движение");

    }
    @Override
    void stopMove() {
        System.out.println(" автобус закончил движение");

    }

    @Override
    public void printType() {
        if (capacity==null){
            System.out.println("Данных не достаточно");
        }else {
            System.out.println("Вместимость автобуса от  "+ capacity.getFrom()+" до "+capacity.getTo());
        }
    }

    @Override
    public boolean service() {
        System.out.println(" Автобус "+ getModel()+ "в диагностике не требуется");
        return false;
    }
}


