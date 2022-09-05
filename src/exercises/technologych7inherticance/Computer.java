package exercises.technologych7inherticance;

public abstract class Computer extends AbstractEntity {

    //computer is parent class

//properties
    private String model;
    private double ipAddress;
    private boolean mac;


//constructor
    public Computer (String model) {
        super();
        this.model = model;
    }

    //methods
    public String getModel(){
        return model;
    }

    public void setModel(String model) {
        this.model =  model;
    }

    public void addMake (String make) {
        this.model = this.model + make;
    }

}
