package transport;

import transport.driver.Driver;
import transport.driver.DriverB;

import java.util.Arrays;

public class Car extends Transport<DriverB> {

    public enum bodyType {
        sedan, hatchback, coupe, station_wagon,
        SUV, crossover, pickup_truck, van, minivan
    }

    public class bodyT {

        public bodyType[] body = new bodyType[0];
    }

    public Car(String brand, String model, double engineVolume, DriverB driverB) {

        super(brand, model, engineVolume, driverB);
    }

    public void startMove() {
        System.out.println("Автомобиль марки " + getBrand() + " начал движение");
    }

    public void finishMove() {
        System.out.println("Автомобиль марки " + getBrand() + " закончил движение");
    }

    public void pitStop() {
        System.out.println("Пит-стоп у авто");
    }

    public void theBestCircleTime() {
        int minBound = 100;
        int maxBound = 150;
        int theBestTimeInMins = (int) (minBound + (maxBound - minBound) * Math.random());

        System.out.println("Лучшее время круга для автомобиля " + theBestTimeInMins);
    }

    public void maxSpeed() {
        int minBound = 150;
        int maxBound = 200;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());

        System.out.println("Максимальная скорость для автомобиля - " + maxSpeed);
    }


    public String[] getAllBodyType() {
        String[] body = new String[bodyType.values().length];
        for (int i = 0; i < body.length; i++) {
            body[i] = bodyType.values()[i].name();

        }
        return body;

    }

    public void body(String bodyT) {
        bodyType bd = bodyType.valueOf(bodyT);

        bd = Arrays.copyOf(bd, bd.length + 1);
        bd[bd.length - 1] = bd;

    }

    public void nameBodyType(String bodyT) {
        System.out.println("Тип кузова " + bodyT);
        bodyType bd = bodyType.valueOf(bodyT);

        switch (bd) {
            case sedan:
                System.out.println("седан");
                break;
            case hatchback:
                System.out.println("хетчбек");
                break;
            case coupe:
                System.out.println("купе");
                break;
            case station_wagon:
                System.out.println("универсал");
                break;
            case SUV:
                System.out.println("внедорожник");
                break;
            case crossover:
                System.out.println("кросоввер");
                break;
            case pickup_truck:
                System.out.println("пикап");
                break;
            case van:
                System.out.println("фургон");
                break;
            case minivan:
                System.out.println("минивэн");
                break;

        }
    }
}

