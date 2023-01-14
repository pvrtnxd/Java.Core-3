package driver;

public class DriverB extends Driver{

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
}
