package homework5;

/**
 * Задание 1
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
 * Результат привести к верхнему регистру.
 * <p>
 * Например:
 * "abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */

public class Task1 {

    private static final String EMPTY = "";
    private static final String SPACE = " ";

    public static void main(String[] args) {

        String value = "abc Cpddd Dio OsfWw";
        String result = deleteReplicasAndUppercase(value);
        System.out.println(result);
    }

    private static String deleteReplicasAndUppercase(String value) {
        value = value.toUpperCase();
        value = value.replace(SPACE, EMPTY);
        String result = "";  // хранит итоговый результат
        char initialChar = '\0';  // вначале нейтральное значение для сравнения, потом
        // хранит символ из исходной строки

        for (int i = 0; i < value.length(); i++) {
            char currentChar = value.charAt(i);

            if (currentChar != initialChar) {
                result += currentChar;
            }

            initialChar = currentChar;
        }

        return result;
    }
}
