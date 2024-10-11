import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        1. Объявить переменную с типом данных String,
        название которой состоит из нескольких слов,
        не инициализировать ей значение.
         */
        String concatString;
        //2. Создать константу “NUM” с типом данных int и задать ей любое значение.
        final int NUM = 1;
        //3. Создать переменную “word” с типом данных String и задать ей любое значение.
        String word = "урок";
        /*
        4. Задать значение переменной объявленной в пункте 1,
        которое состояло бы из результата конкатенации константы “NUM”  и переменной “word”.
         */
        concatString = NUM + word;
        //5. Распечатать в консоли значение всех переменных.
        System.out.println("NUM: " + NUM);
        System.out.println("word: " + word);
        System.out.println("concatenatedString: " + concatString);
        /*
        6. Добавить только 1 условную конструкцию, которая бы выводила на экран следующее:
        если значение константы “NUM” меньше нуля - “Вы сохранили отрицательное число”,
        если же значение больше нуля - “Вы сохранили положительное число”,
        иначе - “Вы сохранили ноль”
         */
        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }
        //7. Сделать так, чтобы программа выводила в консоль строку “Введите ваше имя: ”.
        System.out.print("Введите ваше имя: ");
        //8. Затем программа должна считать имя пользователя, введенное с клавиатуры в консоль.
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        /*
        9. И в конце программа должна поприветствовать пользователя по имени, которое вы ввели с клавиатуры.
        Например: “Привет, Алтынбек!”, если в консоль было введено имя Алтынбек.
         */
        System.out.println("Привет, " + userName + "!");
    }
}