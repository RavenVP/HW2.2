package transport;

import java.time.LocalDate;

public class Car extends Transport {

    double engineValue;
    String transmission;
    private String bodyType;
    String regNumber;
    private int seats;
    String tyreSeason;
    int seasonTyreVariator;
    private Key key;
    private Insurance insurance;


    public static class Key {
        private String remoteEngine;
        private String withOutKey;

        public String getRemoteEngine() {return remoteEngine;}
        public void setRemoteEngine(String remoteEngine) {this.remoteEngine = remoteEngine;}
        public String getWithOutKey() {return withOutKey;}
        public void setWithOutKey(String withOutKey){this.withOutKey = withOutKey;}



        public Key(String remoteEngine, String withOutKey) {
            if (remoteEngine == null || remoteEngine.isBlank() || remoteEngine.isEmpty()) {
                this.remoteEngine = "<<default>>";
            } else {
                this.remoteEngine = remoteEngine;}
            if (withOutKey == null || withOutKey.isBlank() || withOutKey.isEmpty()) {
                this.withOutKey = "<<default>>";
            } else {
                this.withOutKey = withOutKey;}

        }
    }

    public Car(  String brand, String model,double engineValue,String color,int productionYear, String productionCountry, String bodyType, String regNumber, int seats, int seasonTyreVariator,String transmission, int maxSpeed,String fuel) {
        super(brand,model,color,productionYear, productionCountry,maxSpeed,fuel);

        if (engineValue <= 0 ) {
            this.engineValue = 1.5;
        } else {
            this.engineValue = engineValue;}

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
        super.info();
        System.out.println("Цвет  -> " + getColor());
        System.out.println("Объём двигателя -> " + engineValue);
        System.out.println("Тип кузова -> " + bodyType);
        System.out.println("Кол-во сидений -> " + seats);
        System.out.println("Номер -> " + regNumber);
        System.out.println("Коробка передач -> " + transmission);
        System.out.println("Резина -> " + tyreSeason);
        System.out.println("Удалённый запуск двигателя -> " + key.remoteEngine);
        System.out.println("Бесключевой доступ -> " + key.withOutKey);
        System.out.println("Максимальная скорость -> " + getMaxSpeed());
        if (insurance.periodInsurance.isBefore(LocalDate.now())) {
            System.out.println("Срок действия страховки ->  Просрочена " );
        } else System.out.println("Срок действия страховки ->" + insurance.periodInsurance);
        if (insurance.numberInsurance.length() < 9) {
            System.out.println("Номер страховки ->  Неверный ввод " );
        } else System.out.println("Номер страховки -> " + insurance.numberInsurance);
        System.out.println("Стоимость страховки -> " + insurance.costInsurance);
    }

    public void refill() {
    }

    public static class Insurance {
        private final LocalDate periodInsurance ;
        private double costInsurance;
        private String numberInsurance;
        public void setCostInsurance(double costInsurance) {this.costInsurance = costInsurance;}

        public void setNumberInsurance(String numberInsurance) {this.numberInsurance = numberInsurance;}


        public Insurance(LocalDate periodInsurance, double costInsurance, String numberInsurance) {
            this.periodInsurance = periodInsurance;
            this.costInsurance = costInsurance;
            this.numberInsurance = numberInsurance;
        }
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

    public Key getKey() {return key;}

    public void setKey(Key key) {this.key = key;}

    public Insurance getInsurance() {return insurance;}

    public void setInsurance(Insurance insurance) {this.insurance = insurance;}
}
