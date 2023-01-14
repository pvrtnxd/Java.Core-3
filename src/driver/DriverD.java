package driver;

public class DriverD extends Driver{

    public DriverD (String name,
                    boolean hasDriverLicense,
                    int experienceInYears) {
        super(name, hasDriverLicense, experienceInYears);
    }

    public void startMove() {
        System.out.println("Водитель категории D " + getName() + " начал движение");
    }

    public void finishMove() {
        System.out.println("Водитель категории D " + getName() + " закончил движение");
    }

    public void refill() {
        System.out.println("Водитель категории D " + getName() + " заправляется");
    }
}

