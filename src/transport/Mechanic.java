package transport;

import java.util.Objects;

public class Mechanic < T extends Transport > {

    private String name;
    private String company;
    private TransportType transportType;

    public Mechanic(String name, String company, TransportType transportType) {
        this.name = name;
        this.company = company;
        this.transportType = transportType;
    }

    public Mechanic (String name, String company) {
        this.name = name;
        this.company = company;
    }

    public void maintenance () {
        System.out.println(name + " из компании " + company + " проводит техобслуживание");

    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return name.equals(mechanic.name) && company.equals(mechanic.company);
    }

    public int hashCode() {
        return Objects.hash(name, company);
    }

    public void fixing () {
        System.out.println(name + " из компании " + company + " чинит авто") ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }
}
