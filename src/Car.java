public class Car {
    private long id;
    private String numberOfCar;

    public Car(long id, String numberOfCar) {
        this.id = id;
        this.numberOfCar = numberOfCar;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumberOfCar() {
        return numberOfCar;
    }

    public void setNumberOfCar(String numberOfCar) {
        this.numberOfCar = numberOfCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", numberOfCar='" + numberOfCar + '\'' +
                '}';
    }
}
