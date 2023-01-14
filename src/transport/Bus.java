package transport;

import java.sql.Driver;

public class Bus extends Transport<DriverD> {

    public Bus (String brand,
                String model,
                double engineVolume,
                Driver driver) {
        super(brand, model, engineVolume, driver);
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
        int minBound = 80;
        int maxBound = 120;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());

        System.out.println("Максимальная скорость для автобуса - " + maxSpeed);
    }
}
