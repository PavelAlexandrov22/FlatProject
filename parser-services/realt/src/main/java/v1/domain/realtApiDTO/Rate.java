package v1.domain.realtApiDTO;

import java.util.Date;
import java.util.Map;

public class Rate {
    private Map<String, Long> priceRates;
    private Map<String, Long> priceRatesM2;
    private Map<String, Long> priceRatesM2Max;
    private Map<String, Long> priceRatesM2Min;
    private Map<String, Long> priceRatesMin;
    private Map<String, Long> priceRatesMax;
    private int priceCurrency;
    private Date updatedAt;
    private int status;

    public Rate() {
    }

    public Rate(Map<String, Long> priceRates, Map<String, Long> priceRatesM2, Map<String, Long> priceRatesM2Max, Map<String, Long> priceRatesM2Min, Map<String, Long> priceRatesMin, Map<String, Long> priceRatesMax, int priceCurrency, Date updatedAt, int status) {
        this.priceRates = priceRates;
        this.priceRatesM2 = priceRatesM2;
        this.priceRatesM2Max = priceRatesM2Max;
        this.priceRatesM2Min = priceRatesM2Min;
        this.priceRatesMin = priceRatesMin;
        this.priceRatesMax = priceRatesMax;
        this.priceCurrency = priceCurrency;
        this.updatedAt = updatedAt;
        this.status = status;
    }

    public Map<String, Long> getPriceRates() {
        return priceRates;
    }

    public void setPriceRates(Map<String, Long> priceRates) {
        this.priceRates = priceRates;
    }

    public Map<String, Long> getPriceRatesM2() {
        return priceRatesM2;
    }

    public void setPriceRatesM2(Map<String, Long> priceRatesM2) {
        this.priceRatesM2 = priceRatesM2;
    }

    public Map<String, Long> getPriceRatesM2Max() {
        return priceRatesM2Max;
    }

    public void setPriceRatesM2Max(Map<String, Long> priceRatesM2Max) {
        this.priceRatesM2Max = priceRatesM2Max;
    }

    public Map<String, Long> getPriceRatesM2Min() {
        return priceRatesM2Min;
    }

    public void setPriceRatesM2Min(Map<String, Long> priceRatesM2Min) {
        this.priceRatesM2Min = priceRatesM2Min;
    }

    public Map<String, Long> getPriceRatesMin() {
        return priceRatesMin;
    }

    public void setPriceRatesMin(Map<String, Long> priceRatesMin) {
        this.priceRatesMin = priceRatesMin;
    }

    public Map<String, Long> getPriceRatesMax() {
        return priceRatesMax;
    }

    public void setPriceRatesMax(Map<String, Long> priceRatesMax) {
        this.priceRatesMax = priceRatesMax;
    }

    public int getPriceCurrency() {
        return priceCurrency;
    }

    public void setPriceCurrency(int priceCurrency) {
        this.priceCurrency = priceCurrency;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
