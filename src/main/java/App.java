import model.ExchangeRate;
import org.springframework.http.converter.json.GsonBuilderUtils;
import services.ConsoleService;
import services.ExchangeRateService;

public class App {
    private final ConsoleService consoleService = new ConsoleService();
    private final ExchangeRateService exchangeRateService = new ExchangeRateService();

    public static void main(String[] arg){
        App app = new App();
        app.run();
    }

    public void run() {
        System.out.println("Welcome to the Currency Conversion Calculator!");
        System.out.println();
        int menuSelection = -1;
        while (menuSelection != 2){
            menuSelection = consoleService.mainMenuPrompt();
            if (menuSelection == 1){
                String baseCurrency = consoleService.getBaseCurrencyInput();
                String targetCurrency = consoleService.getTargetCurrencyInput();
                ExchangeRate exchangeRate = exchangeRateService.getExchangeRate(baseCurrency, targetCurrency);
                double baseMoney = consoleService.getStartingMoney(baseCurrency);
                exchangeRate.getMoney(baseMoney, targetCurrency);
            } else if (menuSelection == 2){
                continue;
            }
            else {
                System.out.println("Invalid selection. Try again.");
            }
        }
    }
}
