package transport;

import java.sql.Driver;

public class Car extends Transport<DriverB>{

    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int seatCount;
    private boolean summerTyres;
    private static final String DEFAULT_VALUE = "default";
    private static final int DEFAULT_SEATS_COUNT = 5;

    public Car (String brand, String model,
                double engineVolume, Driver driver) {
        super(brand, model, engineVolume, driver);
    }

    public Car (String brand, String model, double engineVolume,
                String color, int year, String country, String transmission,
                int maxSpeed, String bodyType, String registrationNumber,
                int seatCount, boolean summerTyres, Driver driver) {

        super(brand, model, engineVolume, driver);


        if (bodyType == null) {
            this.bodyType = DEFAULT_VALUE;
        } else {
            this.bodyType = brand;
        }

        if (seatCount <= 0) {
            this.seatCount = DEFAULT_SEATS_COUNT;
        } else {
            this.seatCount = year;
        }

        setTransmission(transmission);
        setRegistrationNumber(registrationNumber);
        setSummerTyres(summerTyres);





}
