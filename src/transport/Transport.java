package transport;

public abstract class Transport {
    private String brand;
    private String model;
    private String color;
    private int productionYear;
    private String productionCountry;
    private int maxSpeed;
    private String fuel;

    public String getBrand() {return brand;}

    public String getModel() {return model;}

    public void setModel(String model) {this.model = model;}

    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}
    public int getMaxSpeed() {return maxSpeed;}
    public void setMaxSpeed(int maxSpeed) {this.maxSpeed = maxSpeed;}

    public String getFuel() {return fuel;}

    public abstract void refill();


    public void info() {
        System.out.println("");
        System.out.println("Название || Бренд -> " + brand);
        System.out.println("Модель -> " + model);
        System.out.println("Год выпуска -> " + productionYear);
         System.out.println("Сборка -> " + productionCountry);
        System.out.println("Максимальная скорость -> " + getMaxSpeed() + " Км/ч");

    }

    public Transport (String brand, String model, String color, int productionYear, String productionCountry, int maxSpeed, String fuel) {

        if (fuel == null || fuel.isBlank() || fuel.isEmpty()) {
            this.fuel = "<<default>>";
        } else {
            this.fuel = fuel;
        }

        if (brand == null || brand.isBlank() || brand.isEmpty()) {
            this.brand = "<<default>>";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isBlank() || model.isEmpty()) {
            this.model = "<<default>>";
        } else {
            this.model = model;
        }

        if (color == null || color.isBlank() || color.isEmpty()) {
            this.color = "Белый";
        } else {
            this.color = color;
        }

        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }

        if (productionCountry == null || productionCountry.isBlank() || productionCountry.isEmpty()) {
            this.productionCountry = "<<default>>";
        } else {
            this.productionCountry = productionCountry;
        }

        if (maxSpeed <= 0) {
            this.maxSpeed = 200;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }
}
