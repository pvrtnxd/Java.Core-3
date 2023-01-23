package transport.driver;

public abstract class Driver {

    private String name;
    private boolean hasDriverLicense;
    private int experienceYears;

    public Driver (String name,
                   boolean hasDriverLicense,
                   int experienceYears) {
        this.name = name;
        this.hasDriverLicense = hasDriverLicense;
        this.experienceYears = experienceYears;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasDriverLicense() {return hasDriverLicense;}

    public void  setHasDriverLicense(boolean hasDriverLicense) {this.hasDriverLicense = hasDriverLicense;}

    public int getExperienceYears() {return experienceYears;}

    public void setExperienceYears(int experienceYears) {this.experienceYears = experienceYears;}

    public abstract void startMove();
    public abstract void finishMove();
    public abstract void refill();


}
