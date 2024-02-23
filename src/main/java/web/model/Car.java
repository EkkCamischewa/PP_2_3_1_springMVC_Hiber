package web.model;


public class Car {
    private String model;
    private int series;
    private int yearOfRealise;

    public Car(String model, int series, int yearOfRealise) {
        this.model = model;
        this.series = series;
        this.yearOfRealise = yearOfRealise;
    }

    public Car(){

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getYearOfRealise() {
        return yearOfRealise;
    }

    public void setYearOfRealise(int yearOfRealise) {
        this.yearOfRealise = yearOfRealise;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", yearOfRealise=" + yearOfRealise +
                '}';
    }
}
