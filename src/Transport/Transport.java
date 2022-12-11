package Transport;

public abstract class Transport {
    private String make;
    private String model;
    private double engineCapacity;

    public Transport(String make, String model, double engineCapacity) {
        this.make = Validate.validationString(make);
        this.model = Validate.validationString(model);
        this.engineCapacity = engineCapacity;
    }
    abstract void startMove() ;

    abstract void stopMove();

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = Validate.validationString(make);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = Validate.validationString(model);
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}



