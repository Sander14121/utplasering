public class Car {
    String manufacturers;
    String model;
    int year;

    public Car(String manufacturers, String model, int year){
        this.manufacturers = manufacturers;
        this.model = model;
        this.year = year;
    }

    public String getManufacturers() {
        return manufacturers;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}


