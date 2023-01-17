package transport;


import transport.driver.DriverD;

import java.net.http.HttpResponse;
import java.sql.Driver;
import java.util.Arrays;

public class Bus extends Transport<DriverD> {

    public enum capacity {tiny,small,middle,bid, large }

    public  class  capaC {

        public capacity[] cc = new capacity[0];
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

    public String [] getAllCapacity() {
        String[] cc = new String[capacity.values().length];
        for (int i = 0; i < cc.length; i++) {
            cc[i] = capacity.values()[i].name();
            
        }
        return  cc;

    }

    public void cap (String cc) {
        capacity c = capacity.valueOf(cc);

        c = Arrays.copyOf(c, c.length + 1);
        c [ c.length - 1 ] = c;

    }

    public void allCapacity (String cc) {

        System.out.println("Вместимость " + cc);
        cc = cc.valueOf(cc);

        capacity c = capacity.valueOf(cc);

        switch (c) {
            case tiny:
                System.out.println("особо малая (до 10 мест)");
                break;
            case small:
                System.out.println("малая (до 25)");
                break;
            case middle:
                System.out.println("средняя (40-50)");
                break;
            case bid:
                System.out.println("большая (60-80)");
                break;
            case large:
                System.out.println("особо большая (100-120)");
                break;

        }
    }




}
