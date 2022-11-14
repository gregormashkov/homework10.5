import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        // Задание 1.
        int[] sumCosts = generateRandomArray();
        int sum = 0;
        for (int i : sumCosts) {
            sum += i;
        }
        // Задание 2.
        IntSummaryStatistics stats = Arrays.stream(sumCosts).summaryStatistics();
        System.out.println("Минимальное значение " + stats.getMin());
        System.out.println("Максимальное значение " + stats.getMax());
        //Задание 3.
        int total = IntStream.of(sumCosts).sum();
        int totalPerMonth = total / 30;
        System.out.println("Средняя сумма трат за месяц составила " + totalPerMonth + "рублей");
        // Задание 4.
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int length = 0;
        for (int element : reverseFullName) {
            length++;
            for (int i = length - 1; i >= 0; i--) {
                System.out.println(reverseFullName[i]);
            }
        }

    }
    public static int[] generateRandomArray () {
        java.util.Random random = new java.util.Random();
        int[] sumCosts = new int[30];
        for (int i = 0; i < sumCosts.length; i++) {
            sumCosts[i] = random.nextInt(100_000) + 100_000;
        }
        return sumCosts;
    }
}
// Сделано ДЗ


