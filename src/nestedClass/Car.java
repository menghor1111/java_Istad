package nestedClass;

public class Car {
    String model;
    String brand;
    int year;

    Car(String brand, String model, int year){
        this.model = model;
        this.brand = brand;
        this.year = year;

    }
    void showInfo(){
        System.out.println("=========| Can Info |==========");
        System.out.println("Car model : " + model);
        System.out.println("Car brand : " + brand);
        System.out.println("Car year : " + year);
    }

    class Engine {
        int horsepower;
        String type;

        Engine(int horsepower, String type){
            this.horsepower = horsepower;
            this.type = type;
        }
        void showEngineInfo(){
            System.out.println("==========| Engine Info |===============");
            System.out.println("Engine horsepower :" + horsepower);
            System.out.println("Engine type :" + type);
        }

    }
}
