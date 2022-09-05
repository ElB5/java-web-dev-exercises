package exercises.technologych7inherticance;

public class SmartPhone extends Computer {
    //prop
    private double screenSize;

    //construct
    public SmartPhone(String model, double screenSize) {
        super(model);
        this.screenSize = screenSize;
    }

    //method
    public double newPhoneScreenSize () {
        this.screenSize = this.screenSize + .5;
        System.out.println("my screen size is" + screenSize);
        return screenSize;
    }
}
