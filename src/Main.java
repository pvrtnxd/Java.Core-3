
import transport.*;
import transport.driver.Driver;
import transport.driver.DriverB;
import transport.driver.DriverC;
import transport.driver.DriverD;

import java.util.ArrayList;
import java.util.List;

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

            List<Driver> drivers = new ArrayList<>();
            drivers.add(driverB);
            drivers.add(driverD);
            drivers.add(driverC);

            Mechanic mechanic0 = new Mechanic("Ivanov Ivan", "drive", TransportType.ALL);

            Mechanic mechanic1 = new Mechanic("Semenov Semen", "cross", TransportType.ALL);

            Mechanic mechanic2 = new Mechanic("Petrov Pavel", "fire", TransportType.ALL);

            car.addMechanic(mechanic0);
            car.addMechanic(mechanic1);
            car.addMechanic(mechanic2);

            bus.addMechanic(mechanic0);
            truck.addMechanic(mechanic1);

            List<Transport<?>> racers = new ArrayList<>();

            racers.add(car);
            racers.add(bus);
            racers.add(truck);

            for (Transport<?> transport: racers) {
                System.out.println(transport + " " + transport.getDriver() + " " + transport.getMechanics());
            }





            printInfo(car);
            printInfo(bus);
            printInfo(truck);

        }
    }

    private static void printInfo (Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getClass() + " управляет автомобилем" +transport.getBrand() +
                "" + transport.getModel() + " и будет учасвтосвать в заезде");
    }


}

