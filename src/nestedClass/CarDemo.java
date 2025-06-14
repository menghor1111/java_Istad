package nestedClass;

public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car("Lexus","RX 300",2003);
        Car.Engine engine = car.new Engine(220,"3.0-liter V6");

        car.showInfo();
        engine.showEngineInfo();
    }
}
