package transport;

public class Bus extends Transport {
    public Bus(String brand, String model, String color, int productionYear, String productionCountry, int maxSpeed, String fuel) {
        super(brand, model, color, productionYear, productionCountry, maxSpeed, fuel);
    }


    @Override
    public void refill() {
    }

    public void info() {
        super.info();
    }
}
