/**
 * Класс, представляющий команду деление двух чисел.
 * Реализует интерфейс {@link Command}.
 */
class DivCommand implements Command {
    @Override
    public String execute(Context context) {
        try {
            if (context.getY() == 0) {
                throw new ArithmeticException("Нельзя делить на ноль!");
            }
            return String.format("%.4f", context.getX() / context.getY());
        } catch (ArithmeticException e) {
            return e.getMessage();
        }
    }
}