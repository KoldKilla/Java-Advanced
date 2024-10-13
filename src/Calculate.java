import java.util.HashMap;
import java.util.Map;

/**
 * Данный класс предназначен для произведения математических операций.
 *
 */
public class Calculate {
    private final Map<Integer, Command> commands = new HashMap<>();

    /**
     * Конструктор, который инициализирует доступные математические команды.
     */
    public Calculate() {
        commands.put(1, new AddCommand());
        commands.put(2, new SubCommand());
        commands.put(3, new MultCommand());
        commands.put(4, new DivCommand());
    }

    /**
     * Выполняет указанную математическую операцию на основе действия.
     *
     * @param action Код действия для выполнения (1 - сложение, 2 - вычитание, 3 - умножение, 4 - деление).
     * @param context Контекст, содержащий входные данные для операции.
     * @return Результат выполнения операции в виде строки или сообщение об ошибке.
     */
    public String calculate(int action, Context context) {
        Command command = commands.get(action);
        return command != null ? command.execute(context) : "Неверное действие";
    }
}
