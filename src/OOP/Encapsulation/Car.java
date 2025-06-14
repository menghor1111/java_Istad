package OOP.Encapsulation;

public class Car {

    private String Brand;

    private String model;

    private Integer productionYear;

    public Integer getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(Integer productionYear) {
        this.productionYear = productionYear;
    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }



    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }
}
