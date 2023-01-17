package transport;

import transport.driver.DriverC;

import java.sql.Driver;
import java.util.Arrays;

public class Truck extends Transport<DriverC>{

    public enum loadCapacity {N1,N2,N3}

    public  class  loadC {

        public loadCapacity[] lc = new loadCapacity[0];
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


    public String [] getAllLoadCapacity() {
        String[] lc = new String[loadCapacity.values().length];
        for (int i = 0; i < lc.length; i++) {
            lc[i] = loadCapacity.values()[i].name();

        }
        return  lc;

    }

    public void lCap (String lc) {
        loadCapacity c = loadCapacity.valueOf(lc);

        c = Arrays.copyOf(c, c.length + 1);
        c [ c.length - 1 ] = c;

    }

    public void allLoadCapacity (String cc) {

        System.out.println("Грезоподъемность " + cc);
        cc = cc.valueOf(cc);

        loadCapacity c = loadCapacity.valueOf(cc);

        switch (c) {
            case N1:
                System.out.println("N1 (с полной массой до 3,5 тонн)");
                break;
            case N2:
                System.out.println("N2 (с полной массой свыше 3,5 до 12 тонн)");
                break;
            case N3:
                System.out.println("N3 (с полной массой свыше 12 тонн)");
                break;


        }
    }
}
