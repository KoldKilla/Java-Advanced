/**
 * Класс, представляющий команду сложения двух чисел.
 * Реализует интерфейс {@link Command}.
 */
class AddCommand implements Command {
    @Override
    public String execute(Context context) {
        return String.format("%.4f", context.getX() + context.getY());
    }
}