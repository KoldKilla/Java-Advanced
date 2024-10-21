package secondTask;

public class Jellybean implements Sweets{
    String name;
    int price;
    int weight;
    String taste;

    public Jellybean(String name, int price, int weight, String taste) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.taste = taste;
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

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
}
