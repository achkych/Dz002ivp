import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {
    public static void main(String[] args) {
        float number = readFloatFromUser();
        System.out.println("Введенное число: " + number);
    }

    private static float readFloatFromUser() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                System.out.print("Введите дробное число: ");
                String input = reader.readLine();
                float number = Float.parseFloat(input);
                return number;
            } catch (IOException e) {
                System.out.println("Ошибка ввода-вывода. Повторите попытку.");
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: некорректный ввод! Пожалуйста, введите дробное число.");
            }
        }
    }
}
