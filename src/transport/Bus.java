package transport;


import transport.driver.DriverD;


public class Bus extends Transport<DriverD> {

    public enum Capacity {
        TINY(0, 10),
        SMALL(11, 25),
        MIDDLE(16, 50),
        BIG(51, 80),
        LARGE(81, 120);

        private final Integer lowerBound;
        private final Integer upperBound;

        Capacity (Integer lowerBound, Integer upperBound) {
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
        }

        public static Capacity findByCapacity(Integer capacity) {
            for (Capacity capacity1: values()) {
                if (capacity1.getLowerBound() < capacity && capacity <= capacity1.getUpperBound()) {
                    return capacity1;
                }
            }
            return null;

        }

        public Integer getUpperBound() {
            return lowerBound;
        }

        public Integer getLowerBound() {
            return upperBound;
        }

        public String toString () {
            return "Вместимость: " +
                    "<" + lowerBound +
                    "> - <" + upperBound +
                    ">";
        }
    }

    private Capacity capacity;

    public Bus (String brand,
                String model,
                double engineVolume, DriverD driverD)    {
        super(brand, model, engineVolume, driverD);
    }

    public String printType() {
        if (capacity != null) {
            return capacity.toString();
        } else {
            return "Данных по транспортному средству недостаточно";
        }
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = Capacity.findByCapacity(capacity);
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
