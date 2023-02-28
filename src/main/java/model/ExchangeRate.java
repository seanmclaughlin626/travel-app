package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class ExchangeRate {
    @JsonProperty("base_code")
    private String baseCurrency;
    @JsonProperty("target_code")
    private String targetCurrency;
    @JsonProperty("conversion_rate")
    private double conversionRate;

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public void setTargetCurrency(String targetCurrency) {
        this.targetCurrency = targetCurrency;
    }

    public double getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(double conversionRate) {
        this.conversionRate = conversionRate;
    }

    public void getMoney(double baseMoney, String targetCurrency){
        double targetMoney = baseMoney * this.conversionRate;
        System.out.println(baseMoney + " " + baseCurrency + " = " + targetMoney + " " + targetCurrency);
    }
}
