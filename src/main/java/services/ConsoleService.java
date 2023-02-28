package services;

import java.util.Locale;
import java.util.Scanner;

public class ConsoleService {
    private final Scanner scanner = new Scanner(System.in);

    public int mainMenuPrompt(){
        System.out.println("What do you want to do? Please select a number listed below: ");
        System.out.println("1: Make a conversion");
        System.out.println("2: Exit");
        return Integer.parseInt(scanner.nextLine());
    }

    public String getBaseCurrencyInput(){
        System.out.println("Please enter your base currency code (USD, GBP, etc.): ");
        return scanner.nextLine().toUpperCase();
    }

    public String getTargetCurrencyInput(){
        System.out.println("Please enter currency code to convert to (USD, GBP, etc.): ");
        return scanner.nextLine();
    }

    public double getStartingMoney(String baseCurrency){
        System.out.println("How much " + baseCurrency + " are you starting with?");
        return Double.parseDouble(scanner.nextLine());
    }
}
