package transport;

public class Train extends Transport {
    private int tripCost;
    private String startPoint;
    private String finalPoint;
    private int numWagons;

    public int getTripCost() {return tripCost;}

    public void setTripCost(int tripCost) {this.tripCost = tripCost;}

    public String getStartPoint() {return startPoint;}

    public void setStartPoint(String startPoint) {this.startPoint = startPoint;}

    public String getFinalPoint() {return finalPoint;}

    public void setFinalPoint(String finalPoint) {this.finalPoint = finalPoint;}

    public int getNumWagons() {return numWagons;}

    public void setNumWagons(int numWagons) {this.numWagons = numWagons;}

    public Train(String brand, String model, String color, int productionYear, String productionCountry, int maxSpeed, int tripCost, String startPoint, String finalPoint, int numWagons) {
        super(brand, model, color, productionYear, productionCountry, maxSpeed);
        this.tripCost = tripCost;
        this.startPoint = startPoint;
        this.finalPoint = finalPoint;
        this.numWagons = numWagons;
    }

    public void info() {
        super.info();
        System.out.println("Цена поездки -> " + tripCost + " рублей");
        System.out.println("Отправляется из -> " + startPoint);
        System.out.println("Отправляется в  -> " + finalPoint);
        System.out.println("Количество вагонов  -> " + numWagons);

    }
}

