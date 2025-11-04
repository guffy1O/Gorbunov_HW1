import java.util.Scanner;

public class Main {
    public static void exercise1()
    {
        byte Byte = 127;
        short Short = 32767;
        int Int = 2147483647;
        long Long = 9223372036854775807L;

        float Float = 3.14f;
        double Double = 3.14159d;

        boolean True = true;
        char Char = 'A';

        System.out.println("Byte: " + Byte);
        System.out.println("Short: " + Short);
        System.out.println("Int: " + Int);
        System.out.println("Long: " + Long);
        System.out.println("Float: " + Float);
        System.out.println("Double: " + Double);
        System.out.println("Boolean: " + True);
        System.out.println("Char: " + Char);
    }


    public static void exercise2(String nameInput)
        {
           System.out.println("Привет, " + nameInput + "!");
        }

    public static boolean exercise3(int num)
    {
        return num < 0;
    }

    public static void exercise5()
    {
        System.out.println("Последовательность чисел от 1000 до 0, кратных 3:");
        for (int i = 1000 / 3 * 3; i >= 0; i -= 3)
        {
            System.out.println(i);
        }
    }

    public static void main(String[] args)
    {

        exercise1();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your name: ");
        String nameInput = scanner.nextLine();
        exercise2(nameInput);

        System.out.print("Введите целое число для возврата true or false: ");
        int numToCheck1 = scanner.nextInt();
        boolean result = exercise3(numToCheck1);
        System.out.println("Результат проверки: " + result);

        System.out.print("Введите целое число: ");
        int numToCheck2 = scanner.nextInt();
        boolean result2 = exercise3(numToCheck2);
        if (result2)
        {
            System.out.println("Ваше число отрицательное.");
        }
        else
        {
            System.out.println("Ваше число положительное или ноль.");
        }

        exercise5();

    }
}
