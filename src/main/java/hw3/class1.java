package hw3;

import java.util.Random;
import java.util.Scanner;

public class class1 {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    /**
     * Метод работы первой программы
     */
    public static void task1() {
        System.out.println("Подсчет суммы нечетных положительных чисел");
        System.out.println("------------------------------------------");
        System.out.println("Введите число (0 - завершение ввода): ");

        int counter = 0;
        int sum = 0;
        boolean isNumber = false;
        int number = 0;

        do {
            counter++;
            System.out.print("Введите число: ");
            isNumber = scanner.hasNextInt();
            if (isNumber){
                number = scanner.nextInt();
                scanner.nextLine();
                if (!isEven(number) && number > 0)
                    sum += number;
            }
            else {
                System.out.println("Вы ввели некорректный номер задачи. \nПовторите, пожалуйста, попытку ввода. ");
                scanner.nextLine();
            }
        }
        while (!(isNumber && number == 0));
        System.out.format("Сумма нечетных положительных чисел: %d; Количество попыток ввода: %d\n", sum, counter);
        System.out.println("Завершение работы программы.");
    }

    /**
     * Метод работы второй программы
     */
    public static void task2 () {
            System.out.println("Игра \"Угадайка\""); // оформление шапки игры
            System.out.println("-------------");
            System.out.println("Введите 3 числа (0 - выход из игры):");

            Random random = new Random(); // создание переиенной random
            int num = random.nextInt(10); // создание переменной int num и присваение ей значение переменной random от 0 до 9 включительно
            int counter = 0; // создание переменной int counter и присвоение ей значения 0
            int number1 = 0; // создание переменной int number1 и присвоение ей значения 0
            boolean flag1 = false; // создание boolean переменной flag1 и присвоение ей значения false

            do { // создал цикл do while
                counter++; // увеличиваем значение переменной counter на единицу
                System.out.println("Введите число:");
                flag1 = scanner.hasNextInt(); // проверяем, что мы действительно ввели корректное число
                if (flag1){ // если мы ввели корректные данные (целое число)
                    number1 = scanner.nextInt(); // тогда переменной number1 присваивается значение введенного числа
                    scanner.nextLine(); // чистка буфера
                }
                else { // иначе выводим сообщение с ошибкой
                    System.out.println("Вы ввели некорректное число, \nпожалуйста, повторите попытку ввода.");
                    scanner.nextLine(); // чистка буфера
                    System.out.println(); // разделитель
                    continue; // команда для прерывания оставшейся части цикла в текущей итерации
                }
                System.out.println(); // разделитель

                if (number1 < num && number1 != 0){ // сравниваем введенное число с загаданным числом и выводим сообщение в консоль
                    System.out.println("Указанное пользователем число меньше загаданного числа.");
                    System.out.println(); // разделитель
                }
                if (number1 > num) { // сравниваем введенное число с загаданным числом и выводим сообщение в консоль
                    System.out.println("Указанное пользователем число больше загаданного числа.");
                    System.out.println(); // разделитель
                }
                if (num == number1){ // если числа равны, выводим соответствующее сообщение
                    System.out.println("Указанное пользователем число и загаданное число равны.");
                    System.out.println(); // разделитель
                }
            }
            while (!(flag1 && number1 == 0 || number1 == num || counter == 3));
            /*
            цикл while выполняется до тех пор, пока вводим некорректное число (то есть, пока flag1 = false)
            и (&&) пока переменная number1 не будет равна 0 или (||) пока значение переменной number1 не будет
            равнятся значению переменной num или (||) пока переменная counter не будет равно 3
            */
            if (number1 == num){ // если значение переменной number1 равно значению переменной num
                System.out.println("Вы победили!"); // вывод в консоль
            }

            else if (!flag1){ // иначе если вводимое число некорректное (flag1 = false)
                System.out.println("Закончились попытки для прохождения игры! \nВы проиграли!"); // вывод в консоль
            }
            else if  (number1 == 0) { // иначе если значение переменной number1 равно 0
                System.out.println("Выход из игры..."); // вывод в консоль
            }
            else { // в остальных случаях выводим следующие сообщения в консоль
                System.out.println("Закончились попытки для прохождения игры! \nВы проиграли!");
                System.out.format("Загаданное случайное число: %d", num );
                System.out.println(); // разделитель
            }
            System.out.println(); // разделитель
            boolean flag2 = true; // создана переменная boolean с присвоеным значением true
            do { // создал цикл do while
                System.out.println("Запустить игру еще раз? (1 - да, 0 - нет) "); // сообщение в консоль
                if (scanner.hasNextInt()) { // проверяем, что мы действительно ввели корректное число
                    int choice = scanner.nextInt(); // создана переменная choice, которой присвоено значние вводимого числа
                    scanner.nextLine(); // очистка буфера
                    if (choice == 1 || choice == 0) { // если переменная choice равна 1 переменная choice или равна 0
                        flag2 = false; // тогда значение переменной flag2 будет false
                    }
                    if (choice == 1) { // если переменная choice равна 1
                        task2(); // запускаем метод task2
                        scanner.nextLine(); // чистка буфера
                    }
                }
                else { // в иных случаях повторно запускаем сканнер для ввода данных
                    scanner.nextLine(); // разделитель
                }
            }
            while (flag2); // цикл продолжается, пока flag2 имеет значение true
    }
        public static void task3 () {
            System.out.println("Запуск программы 3...");
            System.out.println("---------------------");

        }
        public static void main (String[]args){

            boolean f = true;
            while (f) {

                System.out.println("1 - Подсчет суммы нечетных положительных чисел");
                System.out.println("2 - Игра \"Угадайка\"");
                System.out.println("3 - Task 3");
                System.out.print("Введите номер задачи (0 - завершение работы программы): ");

                if (scanner.hasNextInt()) {
                    int no = scanner.nextInt();
                    scanner.nextLine();

                    switch (no) {
                        case 0:
                            System.out.println("Завершение работы программы.");
                            f = false;
                            break;
                        case 1:
                            task1();
                            break;
                        case 2:
                            task2();
                            break;
                        case 3:
                            task3();
                            break;
                        default:
                            System.out.println("Вы ввели некорректный номер задачи. \nПовторите, пожалуйста, попытку ввода.");
                    }

                } else {
                    System.out.println("Вы ввели некорректный номер задачи. \nПовторите, пожалуйста, попытку ввода.");
                    scanner.nextLine();
                }
            }
        }
}
