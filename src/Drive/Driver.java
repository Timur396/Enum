package Drive;
import static Transport.Validate.*;

import Transport.Transport;
import Transport.Validate;

public abstract class Driver <T extends Transport>{
    private final String name;
    private final boolean license;
    private final Integer experience;
    private final T car;

    public Driver(String name, boolean license, Integer experience,T car) {
        this.name = validationString(name);
        this.license = license;
        this.experience = validateNumber(experience);
        this.car=car;
    }

    public String getName() {
        return name;
    }

    public boolean isLicense() {
        return license;
    }

    public Integer getExperience() {
        return experience;
    }

    abstract String start();
    abstract String stop();
    abstract String refuel();


}
