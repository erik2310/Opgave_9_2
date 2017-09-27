public class Stock {

    // Deklarere variabler
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;


    // Constructor
    Stock() {

    }

    // Constructor med symbol og name
    Stock(String newSymbol, String newName) {
        symbol = newSymbol;
        name = newName;
    }

    //Metode der returnere med hvor mange procent den har ændret sig
    double getChangePercent() {
        return previousClosingPrice - currentPrice;
    }
}
