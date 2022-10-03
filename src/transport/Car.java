package transport;

import javax.swing.*;

public class Car {
    private String brand;
    private String model;
    double engineValue;
    String color;
    private int productionYear;
    private String productionCountry;
    String transmission;
    private String bodyType;
    String regNumber;
    private int seats;
    String tyreSeason;
    int seasonTyreVariator;

    public Car(String brand, String model, double engineValue, String color, int productionYear, String productionCountry,String bodyType, String regNumber, int seats, int seasonTyreVariator,String transmission) {

        if (brand == null || brand.isBlank() || brand.isEmpty()) {
            this.brand = "<<default>>";
        } else {
            this.brand = brand;}

        if (model == null || model.isBlank() || model.isEmpty()) {
            this.model = "<<default>>";
        } else {
            this.model = model;}

        if (color == null || color.isBlank() || color.isEmpty()) {
            this.color = "Белый";
        } else {
            this.color = color;}

        if (engineValue <= 0 ) {
            this.engineValue = 1.5;
        } else {
            this.engineValue = engineValue;}

        if (productionYear <= 0 ) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;}

        if (productionCountry == null || productionCountry.isBlank() || productionCountry.isEmpty()) {
            this.productionCountry = "<<default>>";
        } else {
            this.productionCountry = brand;}

        if (bodyType == null || bodyType.isBlank() || bodyType.isEmpty()) {
            this.bodyType = "<<default>>";
        } else {
            this.bodyType = bodyType;}

        if (regNumber.matches("[A-Z]\\d{3}[A-Z]{2}\\d{3}")) {
            this.regNumber = regNumber;
        } else {
            this.regNumber = "<<default>>";
        }

        if (seats <= 0 ) {
            this.seats = 1;
        } else {
            this.seats = seats;}

        switch (seasonTyreVariator) {
            case 1:
                tyreSeason = "Зимняя";
                break;
            case 2:
                tyreSeason = "Летняя";
                break;
            case 3:
                tyreSeason = "Всесезонная";
                break;
            default:
                tyreSeason = "<<default>>";
        }

        if (transmission == null || transmission.isBlank() || transmission.isEmpty()) {
            this.transmission = "<<default>>";
        } else {
            this.transmission = transmission;}
    }


    public void info() {
        System.out.println("");
        System.out.println("Бренд -> " + brand);
        System.out.println("Модель -> " + model);
        System.out.println("Год выпуска -> " + productionYear);
        System.out.println("Сборка -> " + productionCountry);
        System.out.println("Цвет  -> " + color);
        System.out.println("Объём двигателя -> " + engineValue);
        System.out.println("Тип кузова -> " + bodyType);
        System.out.println("Кол-во сидений -> " + seats);
        System.out.println("Номер -> " + regNumber);
        System.out.println("Коробка передач -> " + transmission);
        System.out.println("Резина -> " + tyreSeason);

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getSeats() {
        return seats;
    }

    public double getEngineValue() {
        return engineValue;
    }

    public void setEngineValue(double engineValue) {
        this.engineValue = engineValue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getTyreSeason() {
        return tyreSeason;
    }

    public void setTyreSeason(String tyreSeason) {
        this.tyreSeason = tyreSeason;
    }
}
