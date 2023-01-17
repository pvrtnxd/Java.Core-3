package transport.driver;

import java.sql.Connection;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.logging.Logger;

public class DriverC extends Driver implements java.sql.Driver {

    public DriverC (String name,
                    boolean hasDriverLicense,
                    int experienceInYears) {
        super(name, hasDriverLicense, experienceInYears);
    }

    public void startMove() {
        System.out.println("Водитель категории C " + getName() + " начал движение");
    }

    public void finishMove() {
        System.out.println("Водитель категории C " + getName() + " закончил движение");
    }

    public void refill() {
        System.out.println("Водитель категории C " + getName() + " заправляется");
    }

    @Override
    public Connection connect(String url, Properties info) throws SQLException {
        return null;
    }

    @Override
    public boolean acceptsURL(String url) throws SQLException {
        return false;
    }

    @Override
    public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
        return new DriverPropertyInfo[0];
    }

    @Override
    public int getMajorVersion() {
        return 0;
    }

    @Override
    public int getMinorVersion() {
        return 0;
    }

    @Override
    public boolean jdbcCompliant() {
        return false;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }
}

