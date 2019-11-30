//Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную.
// Результат вывести на экран.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task11 {
    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите строку:");
        String str = reader.readLine();
        System.out.println(str);
    }
}
