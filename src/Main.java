
import transport.Bus;
import transport.Car;
import transport.Transport;
import transport.Truck;
import transport.driver.DriverB;
import transport.driver.DriverC;
import transport.driver.DriverD;

import java.sql.Driver;

public class Main {
    public static void main (String[] args) {
        for (int i = 1; i<=4; i++) {
            DriverB driverB = new DriverB("Водитель катеории В" + i,
                    true, 1);

            Car car = new Car("Бренд " + i,
                    "Модель " + i,
                    1.6, driverB);

            DriverD driverD = new DriverD("Водитель катеории D" + i,
                    true, 2);

            Bus bus = new Bus("Бренд " + i,
                    "Модель " + i,
                    1.6,  driverD);

            DriverC driverC = new DriverC("Водитель катеории C" + i,
                    true, 3);

            Truck truck = new Truck("Бренд " + i,
                    "Модель " + i,
                    1.6,  driverC);

            printInfo(car);
            printInfo(bus);
            printInfo(truck);

        }
    }

    private static void printInfo (Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getName() + " управляет автомобилем" +transport.getBrand() +
                "" + transport.getModel() + " и будет учасвтосвать в заезде");
    }
}