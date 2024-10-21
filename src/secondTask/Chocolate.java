package secondTask;

public class Chocolate implements Sweets {
    String name;
    int price;
    int weight;
    String country;

    public Chocolate(String name, int price, int weight, String country) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.country = country;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
