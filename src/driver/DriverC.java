package driver;

public class DriverC extends Driver{

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
}

