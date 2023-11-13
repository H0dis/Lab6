import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("bmw", "e92");
        Car car2 = new Car("bmw", "e46");
        Car car3 = new Car("bmw", "e39");
        Bicycle bicycle1 = new Bicycle("pegas", "vechi");
        Bicycle bicycle2 = new Bicycle("bmx", "mic");
        Bicycle bicycle3 = new Bicycle("bmx", "mare");

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car1);
        vehicles.add(car2);
        vehicles.add(car3);
        vehicles.add(bicycle1);
        vehicles.add(bicycle2);
        vehicles.add(bicycle3);

        for (Vehicle vehicle : vehicles) {
            System.out.println("Marca: " + vehicle.getBrand());
            System.out.println("Model: " + vehicle.getModel());
            vehicle.speedUp();
            System.out.println();
        }
    }
}