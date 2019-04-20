package classStock;

public class stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;


    public stock() {

    }
    public stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getChenSend() {
        return (currentPrice - previousClosingPrice) / 100;
    }
}
