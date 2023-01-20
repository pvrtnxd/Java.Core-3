package transport;

import transport.driver.DriverB;
import transport.driver.Driver;


public class Car<T extends DriverB> extends Transport implements Competing {

    public enum BodyType {
        SEDAN("седан"),
        HATCHBACK("хетчбек"),
        COUPE("купе"),
        STATION_WAGON("универсал"),
        SUV("внедорожник"),
        CROSSOVER("кроссовер"),
        PICKUP_TRUCK("пикап"),
        VAN("фургон"),
        MINIVAN("минивэн");

        private final String bodyType;

        BodyType (String bodyType) {
        this.bodyType = bodyType;
        }

        public static BodyType findByBodyType(String bodyType) {
            for (BodyType type : values()) {
                if(type.getBodyType().equals(bodyType)) {
                    return type;
                }
            }
            return null;
        }

        public String getBodyType() {
            return bodyType;
        }

        @Override
        public String toString() {
            return "Тип кузова: "
                    + bodyType;
        }
    }
      private BodyType bodyType;
    public void printType(String bodyType) {
        if (bodyType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Кузов: " + bodyType);
        }
    }

    public Car(String brand, String model, double engineVolume, DriverB driverB) {

        super(brand, model, engineVolume, driverB);
    }

    public void passDiagnostics(Driver driver) throws DriverInconsistencyException {
        if (!driver.isHasDriverLicense()) {
            throw new DriverInconsistencyException("Отсутствие водительского удостовирения");
        }
    }

    public void addDriver(T driver) {
        try {
            passDiagnostics((Driver) driver);
            super.setDriver(driver);
        } catch (DriverInconsistencyException e) {
            System.out.println("Водитель не может управлять " + this.getBrand()
                    + " " + this.getModel() + " \n " +
                    "Причина: " + e.getMessage());
        }
    }



    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(String type) {
        this.bodyType = BodyType.findByBodyType(type);
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




}

