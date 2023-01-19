package transport;


import transport.driver.DriverD;

import java.net.http.HttpResponse;
import java.sql.Driver;
import java.util.Arrays;

public class Bus extends Transport<DriverD> {

    public enum Capacity {
        TINY("до 10 мест"),
        SMALL("до 120 мест"),
        MIDDLE("от 40 до 50 мест"),
        BIG("от 50 до 80 мест"),
        LARGE("от 100 до 120 мест");

        private final String capacity;

        Capacity (String capacity) {
            this.capacity = capacity;
        }

        public String getCapacity() {
            return capacity;
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
            return "Вместимость - " + low + upp;
*/
    }

    public Bus (String brand,
                String model,
                double engineVolume, DriverD driverD)    {
        super(brand, model, engineVolume, driverD);
    }

    public void startMove() {
        System.out.println("Автобус марки " + getBrand() + " начал движение");
    }

    public void finishMove() {
        System.out.println("Автобус марки " + getBrand() + " закончил движение");
    }

    public void pitStop() {
        System.out.println("Пит-стоп у автобуса");
    }

    public void theBestCircleTime() {
        int minBound = 100;
        int maxBound = 150;
        int theBestTimeInMins = (int) (minBound + (maxBound - minBound) * Math.random());

        System.out.println("Лучшее время круга для автобуса " + theBestTimeInMins);
    }

    public void maxSpeed() {
        int minBound = 50;
        int maxBound = 70;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());

        System.out.println("Максимальная скорость для автобуса - " + maxSpeed);
    }

}
