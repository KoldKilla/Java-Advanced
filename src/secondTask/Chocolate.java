package secondTask;

public class Chocolate extends Sweets {
    private String countryOfOrigin;

    public Chocolate(String name, int price, int weight, String countryOfOrigin) {
        super(name, price, weight);
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public String getUniqueParameter() {
        return "Страна производства: " + countryOfOrigin;
    }
}
