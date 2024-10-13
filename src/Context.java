/**
 * Класс, представляющий контекст выполнения команды.
 * Содержит два числа для дальнейших операций.
 */
public class Context {
    private double x;
    private double y;

    /**
     * Конструктор для создания экземпляра контекста с заданными значениями.
     *
     * @param x Первое число.
     * @param y Второе число.
     */
    public Context(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Получает значение первого числа.
     *
     * @return Значение первого числа.
     */
    public double getX() {
        return x;
    }

    /**
     * Получает значение второго числа.
     *
     * @return Значение второго числа.
     */
    public double getY() {
        return y;
    }
}