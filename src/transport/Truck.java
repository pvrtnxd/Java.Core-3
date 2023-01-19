package transport;

import transport.driver.DriverC;

import java.sql.Driver;
import java.util.Arrays;

public class Truck extends Transport<DriverC>{

    public enum LoadCapacity {
        N1(null, 3.5f),
        N2(3.5f, 12f),
        N3(12f, null);
        private final Float lowerBound;
        private final Float upperBound;


        LoadCapacity(Float lowerBound, Float upperBound) {
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
        }

        public static LoadCapacity findByLoad(Float load) {
            Float min;
            Float max;
            for (LoadCapacity loadCapacity1 : values()) {
                min = loadCapacity1.getLowerBound() == null ? min = 0f : loadCapacity1.getLowerBound();
                max = loadCapacity1.getUpperBound() == null ? max = 100f : loadCapacity1.getUpperBound();

                if (min <= load && load <= max) {
                    return loadCapacity1;
                }
            }
            return null;
        }

        public String toString() {
            if (upperBound == null) {
                return "Грузоподъемность: от " +
                        lowerBound + " тонн";
            } else if (lowerBound == null) {
                return "Грузоподъемность: до "
                        + upperBound + " тонн";
            } else {
                return "Грузоподъемность: от " +
                        lowerBound + " тонн " +
                        "до " + upperBound + " тонн";
            }
        }

        public Float getLowerBound() {
            return lowerBound;
        }

        public Float getUpperBound() {
            return upperBound;
        }
    }

    private LoadCapacity loadCapacity;






    public Truck (String brand,
                String model,
                double engineVolume,
                DriverC driverC) {
        super(brand, model, engineVolume, driverC);
    }

    public String printType() {
        if (loadCapacity != null) {
            return loadCapacity.toString();
        } else {
            return "Данных по транспортному средству недостаточно";
        }
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(Float loadCapacity) {
        this.loadCapacity = LoadCapacity.findByLoad(loadCapacity);
    }

    public void startMove() {
        System.out.println("Грузовик марки " + getBrand() + " начал движение");
    }

    public void finishMove() {
        System.out.println("Грузовик марки " + getBrand() + " закончил движение");
    }

    public void pitStop() {
        System.out.println("Пит-стоп у грузовика");
    }

    public void theBestCircleTime() {
        int minBound = 80;
        int maxBound = 120;
        int theBestTimeInMins = (int) (minBound + (maxBound - minBound) * Math.random());

        System.out.println("Лучшее время круга для грузовика " + theBestTimeInMins);
    }

    public void maxSpeed() {
        int minBound = 80;
        int maxBound = 120;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());

        System.out.println("Максимальная скорость для грузовика - " + maxSpeed);
    }

}
