package v1.domain.realtApiDTO;

public class CurrencyRate {
    private int from;
    private int to;
    private float rate;

    public CurrencyRate() {
    }

    public CurrencyRate(int from, int to, float rate) {
        this.from = from;
        this.to = to;
        this.rate = rate;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }
}
