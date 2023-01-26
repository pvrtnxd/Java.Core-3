package transport.driver;

import java.sql.Connection;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.logging.Logger;

public class DriverB extends Driver implements java.sql.Driver {

    public DriverB (String name,
                    boolean hasDriverLicense,
                    int experienceInYears) {
        super(name, hasDriverLicense, experienceInYears);
    }

    public void startMove() {
        System.out.println("Водитель категории В " + getName() + " начал движение");
    }

    public void finishMove() {
        System.out.println("Водитель категории В " + getName() + " закончил движение");
    }

    public void refill() {
        System.out.println("Водитель категории В " + getName() + " заправляется");
    }


    public Connection connect(String url, Properties info) throws SQLException {
        return null;
    }

    public boolean acceptsURL(String url) throws SQLException {
        return false;
    }

    public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
        return new DriverPropertyInfo[0];
    }

    public int getMajorVersion() {
        return 0;
    }

    public int getMinorVersion() {
        return 0;
    }


    public boolean jdbcCompliant() {
        return false;
    }


    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }
}
