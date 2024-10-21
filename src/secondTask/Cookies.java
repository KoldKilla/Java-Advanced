package secondTask;

public class Cookies implements Sweets{
    String name;
    int price;
    int weight;
    String calories;

    public Cookies(String name, int price, int weight, String calories) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.calories = calories;
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

    public String getCalories() {
        return calories;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }
}
