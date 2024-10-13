/**
 * Класс, представляющий команду вычитание двух чисел.
 * Реализует интерфейс {@link Command}.
 */
class SubCommand implements Command {
    @Override
    public String execute(Context context) {
        return String.format("%.4f", context.getX() - context.getY());
    }
}
