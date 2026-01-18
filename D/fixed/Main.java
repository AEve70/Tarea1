package D.fixed;

public class Main {
    public static void main(String[] args) {
        Car gasCar = new Car(new GasolineEngine());
        Car electricCar = new Car(new ElectricEngine());

        gasCar.startEngine();
        electricCar.startEngine();
    }
}
