import tsi.too.controller.WorldDemographicGrowthCalculator;

public class Application {
    //Utilize a Web para determinar a população mundial atual e a taxa de crescimento demográfica mundial anual.
    // Escreva um aplicativo que introduza esses valores e, então, que exiba a população mundial estimada depois um, dois,
    // três, quatro e cinco anos.
    public static void main(String[] args) {
        WorldDemographicGrowthCalculator calculator = new WorldDemographicGrowthCalculator();

        calculator.readData();
        calculator.showEstimate();
    }
}
