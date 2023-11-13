public class Car extends Vehicle {
    private static final int SPEED_INCREASE = 50;
public Car(String brand, String model){
    super(brand, model);
}
    @Override
    public void speedUp() {
        int currentSpeed = getSpeed();
        setSpeed(currentSpeed + SPEED_INCREASE);
        printSpeedIncrease("Bicicletă", SPEED_INCREASE);
    }
}