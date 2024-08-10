package src.com.progrank.Predicate;

public class Car {
    private String color;
    private String carName;
    private int price;

    Car(String carName, String color, int price) {
        this.carName = carName;
        this.color = color;
        this.price = price;
    }

    public String getCarName() {
        return carName;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Car[name =" + carName + "color" + color + "price" + price + "]";
    }
}
