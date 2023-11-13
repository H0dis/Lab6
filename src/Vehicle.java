public abstract class Vehicle {
    private int speed;
    private String brand;
    private String model;

    public Vehicle(String brand, String model){
        this.brand=brand;
        this.model=model;
    }
    public Vehicle() {
        this.speed = 0;
    }

    public abstract void speedUp();

    protected void printSpeedIncrease(String vehicleType, int speedIncrease) {
        System.out.println(vehicleType + " a crescut viteza cu " + speedIncrease + " unități.");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}