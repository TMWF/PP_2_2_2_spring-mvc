package web.model;

import java.util.Objects;

public class Car {
    public enum Type {
        HATCHBACK, SEDANE, SUV
    }
    private Type carType;
    private String model;
    private String series;

    public Car(Type carType, String model, String series) {
        this.carType = carType;
        this.model = model;
        this.series = series;
    }

    public Car() {
    }

    public Type getCarType() {
        return carType;
    }

    public void setCarType(Type carType) {
        this.carType = carType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return getCarType() == car.getCarType() && Objects.equals(getModel(), car.getModel()) && Objects.equals(getSeries(), car.getSeries());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCarType(), getModel(), getSeries());
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", model='" + model + '\'' +
                ", series='" + series + '\'' +
                '}';
    }
}
