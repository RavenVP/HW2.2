import javax.swing.*;

public class Car {
    String brand;
    String model;
    double engineValue;
    String color;
    int productionYear;
    String productionCountry;

    Car(String brand, String model, double engineValue, String color, int productionYear, String productionCountry) {
        if (brand == null) {
            this.brand = "<<default>>";
        } else {
            this.brand = brand;}

        if (model == null) {
            this.model = "<<default>>";
        } else {
            this.model = model;}

        if (color == null) {
            this.color = "Белый";
        } else {
            this.color = color;}

        if (engineValue <= 0) {
            this.engineValue = 1.5;
        } else {
            this.engineValue = engineValue;}

        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;}

        if (productionCountry == null) {
            this.productionCountry = "<<default>>";
        } else {
            this.productionCountry = brand;}
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
