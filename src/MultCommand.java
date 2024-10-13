/**
 * Класс, представляющий команду умножение двух чисел.
 * Реализует интерфейс {@link Command}.
 */
class MultCommand implements Command {
    @Override
    public String execute(Context context) {
        return String.format("%.4f", context.getX() * context.getY());
    }
}