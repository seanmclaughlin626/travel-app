package services;
import model.ExchangeRate;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpHeaders;

public class ExchangeRateService {
    private final String API_BASE_URL = "https://v6.exchangerate-api.com/v6/1b5611b5cfe24fb4f83eb630/pair/";
    private final RestTemplate restTemplate = new RestTemplate();

    public ExchangeRate getExchangeRate(String baseCurrency, String targetCurrency){
        return restTemplate.getForObject(API_BASE_URL + baseCurrency + "/" + targetCurrency, ExchangeRate.class);
    }
}
