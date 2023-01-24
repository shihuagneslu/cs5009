package Stock;

/**
 * Shihua Lu. Lab 1.
 * This class takes information of the Stock market.
 */
public class Stock {
    private String symbol;
    private String name;
    private double cost;
    private double currentPrice;

    /**
     * Constructors.
     * @param symbol: the symbol of the stock.
     * @param name: the company name of the stock.
     * @param cost: the cost of the stock.
     */
    public Stock(String symbol, String name, double cost) {
        this.symbol = symbol;
        this.name = name;
        this.cost = cost;
        this.currentPrice = cost;
    }

    /**
     * @return the symbol of the stock.
     */
    public String getSymbol() {
        return this.symbol;
    }

    /**
     * @return the name of the stock.
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return the Base cost of the stock.
     */
    public double getCostBasis() {
        return this.cost;
    }

    /**
     * @return the current prices of the stock.
     */
    public double getCurrentPrice() {
        return this.currentPrice;
    }

    /**
     * @param cost of the stock.
     */
    public void setCostBasis(double cost) {
        this.cost = cost;
    }

    /**
     * @param currentPrice of the stock.
     */
    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    /**
     * @return the percentage of how the price of the stock changes.
     */
    public double getChangePercent() {
        return ((this.currentPrice - this.cost)/this.cost);
    }

    /**
     * @return the tostring of the intake info.
     */
    @Override
    public String toString() {
        return String.format("%s Current Price: $ %.2f\n Gain/Loss: %.2f%%", getName(),
                getCurrentPrice(), getChangePercent() * 100);
    }
}




