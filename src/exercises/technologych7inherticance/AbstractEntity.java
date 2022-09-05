package exercises.technologych7inherticance;

public abstract class AbstractEntity {
    public double id = 0;

    public double id(double id){
        this.id = this.id + 1;
        return id;
    };
}
