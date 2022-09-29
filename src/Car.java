import javax.swing.*;

public class Car {
    String brand;
    String model;
    double engineValue;
    String color;
    int productionYear;
    String productionCountry;

    Car(String brand, String model, double engineValue, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineValue = engineValue;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }

    void info() {
        System.out.println("");
        System.out.println("Бренд -> " + brand);
        System.out.println("Модель -> " + model);
        System.out.println("Год выпуска -> " + productionYear);
        System.out.println("Сборка -> " + productionCountry);
        System.out.println("Цвет  -> " + color);
        System.out.println("Объём двигателя -> " + engineValue  );

    }
}
