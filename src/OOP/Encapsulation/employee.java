package OOP.Encapsulation;

public class employee {

    private String name;

    private Double price;

    public employee(){

    }
    public employee(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public void setName(String name){
        this.name = name ;
    }
    public void setPrice(double price){
        this.price = price ;

    }
    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
