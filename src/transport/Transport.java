package transport;

import transport.driver.DriverB;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Transport <T extends Driver> implements Competing {

    private final String brand;
    private final String model;
    private double engineVolume;
    private final T driver;
    private final Set<Mechanic> mechanics = new HashSet<>();

    private static final String DEFAULT_VALUE = "default";
    private static final double DEFAULT_ENGINE_VOLUME = 1.5;

    public Transport(String brand,
                     String model,
                     double engineVolume,
                     T driver) {

        if (brand == null || brand.isBlank()) {
            this.brand = DEFAULT_VALUE;
        } else {
            this.brand = brand;
        }

        if (model == null || model.isBlank()) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = brand;
        }

        setEngineVolume(engineVolume);
        this.driver = driver;
    }

    public void passDiagnostics(T driver)  {
        System.out.println(this.getBrand() + " " + this.getModel() + " не может пройти диагностику");
    }

    public abstract void startMove();

    public abstract void finishMove();

    public String getBrand() {return brand;}
    public String getModel() {return model;}
    public double getEngineVolume() {return engineVolume;}

    public void setEngineVolume (double engineVolume) {
        if (engineVolume <= 0) {
            engineVolume = DEFAULT_ENGINE_VOLUME;
        }
        this.engineVolume = engineVolume;
    }

    public T getDriver() {return driver;}

    public Set<Mechanic> getMechanics() {
        return mechanics;
    }

    public void addMechanic (Mechanic mechanic) {
        mechanics.add(mechanic);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", driver=" + driver +
                '}';
    }


    protected void setDriver(T driverB) {
    }
}
