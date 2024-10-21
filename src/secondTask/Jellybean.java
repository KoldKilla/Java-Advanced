package secondTask;

public class Jellybean extends Sweets {
    private String taste;

    public Jellybean(String name, int price, int weight, String taste) {
        super(name, price, weight);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String flavor) {
        this.taste = flavor;
    }

    @Override
    public String getUniqueParameter() {
        return "Вкус: " + taste;
    }
}
