package OOP;
import OOP.Encapsulation.Car;


public class DemoOOP {
    public static void main(String[] args) {
        Car Car = new Car();
        Car.setBrand("Lexus");
        Car.setModel("RX 300");
        Car.setProductionYear(2004);

        System.out.println(Car.getBrand());
        System.out.println(Car.getModel());
        System.out.println(Car.getProductionYear());



    }
}
