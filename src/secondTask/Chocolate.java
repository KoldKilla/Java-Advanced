package secondTask;

public class Chocolate implements Sweets {
    String name;
    int price;
    int weight;
    String additionalInformation;

    public Chocolate(String name, int price, int weight, String additionalInformation) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.additionalInformation = additionalInformation;
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

    @Override
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    @Override
    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }
}
