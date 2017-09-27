public class Main {

    public static void main(String[] args) {
        // Laver et stock objekt med et symbol og navn
        Stock stock = new Stock("ORCL","Oracle Corporation");

        // Sætter den tidligere pris og nuværende pris
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;

        // Viser pris ændringen
        System.out.println("Previous Closing Price: " + stock.previousClosingPrice);
        System.out.println("Current Price: " + stock.currentPrice);
        System.out.println("Difference: " + stock.getChangePercent() + " % ");
    }
}
