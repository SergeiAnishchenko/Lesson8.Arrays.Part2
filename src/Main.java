public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println(" ");
        task2();
        System.out.println(" ");
        task3();
        System.out.println(" ");
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    private static void task1() {
        System.out.println("Задача 1");

        int[] arr1 = generateRandomArray();
        int sum = 0;
        for (int element : arr1) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }

    private static void task2() {
        System.out.println("Задача 2");

        int[] arr2 = generateRandomArray();
        int maxSumPerDay = 100_000;
        int minSumPerDay = 200_000;

        for (int i : arr2) {
            if (i < minSumPerDay) {
                minSumPerDay = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSumPerDay + " рублей.");

        for (int j : arr2) {
            if (j > maxSumPerDay) {
                maxSumPerDay = j;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxSumPerDay + " рублей.");
    }

    private static void task3() {
        System.out.println("Задача 3");

        int[] arr3 = generateRandomArray();
        int sum = 0;
        int sumOfDays = 30;

        for (int element : arr3) {
            sum += element;
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum / sumOfDays + " рублей.");
    }

    private static void task4() {
        System.out.println("Задача 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
}