import java.util.Arrays;

public class HomeWorkArrays {

    public static void main(String[] args) {
        part1Task1();
        part1Task2();
        part1Task3();
        part1Task4();
        part2Task1();
        part2Task2();
        part2Task3();
        part2Task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000) + 100000;
        }
        return arr;
    }

    public static void part1Task1() {
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        char[] symbols = {5, 12, 535};
    }
    public static void part1Task2() {
        System.out.println("Task 1.2");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        char[] symbols = {5, 12, 535};
        for (int index1 = 0; index1 < numbers.length; index1++) {
            if (index1 == numbers.length - 1) {
                System.out.println(numbers[index1]);
                break;
            }
            System.out.print(numbers[index1] + ", ");
        }
        for (int index2 = 0; index2 < fractionalNumbers.length; index2++) {
            if (index2 == fractionalNumbers.length - 1) {
                System.out.println(fractionalNumbers[index2]);
                break;
            }
            System.out.print(fractionalNumbers[index2] + ", ");
        }
        for (int index3 = 0; index3 < symbols.length; index3++) {
            if (index3 == symbols.length - 1) {
                System.out.println(symbols[index3]);
                break;
            }
            System.out.print(symbols[index3] + ", ");
        }
    }
    public static void part1Task3() {
        System.out.println("Task 1.3");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        char[] symbols = {5, 12, 535};
        for (int index1 = 2; index1 >= 0; index1--) {
            if (index1 == 0) {
                System.out.println(numbers[index1]);
                break;
            }
            System.out.print(numbers[index1] + ", ");
        }
        for (int index2 = 2; index2 >= 0; index2--) {
            if (index2 == 0) {
                System.out.println(fractionalNumbers[index2]);
                break;
            }
            System.out.print(fractionalNumbers[index2] + ", ");
        }
        for (int index3 = 2; index3 >= 0; index3--) {
            if (index3 == 0) {
                System.out.println(symbols[index3]);
                break;
            }
            System.out.print(symbols[index3] + ", ");
        }
    }
    public static void part1Task4() {
        System.out.println("Task 1.4");
    int[] numbers = new int[3];
    numbers[0] = 1;
    numbers[1] = 2;
    numbers[2] = 3;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] = numbers[i] + 1;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void part2Task1() {
        System.out.println("Part 2 Task 1"); //первая задача из части 2
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum = sum + arr[index];
        }
        System.out.println("Сумма трат за месяц составила " + sum); //если нужно вывести за один месяц
    }

    public static void part2Task2()
    {
        System.out.println("Part 2 Task 2");
        int[] arr = generateRandomArray();
        int max = arr[0];
        int min = arr[0];
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] > max) {
                max = arr[index];
            }
            if (arr[index] < min) {
                min = arr[index];
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + min + "." + "Максимальная сумма трат за день составила " + max + ".");
    }
    public static void part2Task3()
    {
        System.out.println("Part 2 Task 3");
        int[] arr = generateRandomArray();
        int sum = 0;
        int daysInMonth = 30;
        for (int index = 0; index < arr.length; index++) {
            sum = sum + arr[index];
        }
        double averageAmountOfExpensesPerMonth = sum/daysInMonth;
        System.out.println("Средняя сумма трат за месяц составила " + averageAmountOfExpensesPerMonth);
    }
    public static void part2Task4()
    {
        System.out.println("Part 2 Task 4");
        char[] reverseFullName = {'n', 'a', 'v','I', ' ','v','o','n','a','v','I'};
        for (int i = reverseFullName.length-1; i >=0;i--){
            System.out.print(reverseFullName[i]);
        }
    }
}



