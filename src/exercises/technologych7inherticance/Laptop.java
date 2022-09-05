package exercises.technologych7inherticance;

public class Laptop extends Computer {

    //prop
    private String color;

    //construct
    public Laptop(String model, String color) {
        super(model);
        this.color =  color;
    }

    //method
    public String favColorPhone (String color) {
        System.out.println("my cell phone is" + color);
        return color;
    }

//    public double LaptopId (double id) {
//        this.id = this.id + 1;
//        return id;
//    }

}
