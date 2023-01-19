package transport;

import transport.driver.DriverC;

import java.sql.Driver;
import java.util.Arrays;

public class Truck extends Transport<DriverC>{

    public enum LoadCapacity {
        N1("с полной массой до 3,5 тонн"),
        N2("с полной массой свыше 3,5 до 12 тонн"),
        N3("с полной массой свыше 12 тонн");

        private final String loadC;

        LoadCapacity (String loadC) {
            this.loadC = loadC;
        }

        public String getLoad() {
            return loadC;
        }

        /*public String toString() {
            String low = "от" + lowerBound;
            if (lowerBound == 0) {
                low = "";
            }

            String upp = "до" + upperBound;
            if (upperBound == 0) {
                upp = "";
            }
            return "Грузоподъемность - " + low + upp + " тонн";
*/
        }






    public Truck (String brand,
                String model,
                double engineVolume,
                DriverC driverC) {
        super(brand, model, engineVolume, driverC);
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
