package secondTask;

public class Cookies extends Sweets {
    private String calories;

    public Cookies(String name, int price, int weight, String calories) {
        super(name, price, weight);
        this.calories = calories;
    }

    public String getCalories() {
        return calories;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }

    @Override
    public String getUniqueParameter() {
        return "Калорийность: " + calories;
    }
}
