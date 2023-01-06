import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    private static int @NotNull [] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] nums = generateRandomArray();
        int sum = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                sum++;
            }
        }
        System.out.printf(Arrays.toString(nums));
        System.out.println();
        System.out.println(sum);
    }

    private static int @NotNull [] generateRandomArray2() {
        java.util.Random random2 = new java.util.Random();
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random2.nextInt(10) + 1;
        }
        return arr;
    }


    private static void task2() {
        System.out.println("Задача 2");
        int[] nums2 = generateRandomArray2();
        System.out.println(Arrays.toString(nums2));
        for (int i = 0; i < 8; i++) {
            if (i % 2 != 0) {
                nums2[i] = 0;
            }
        }
        System.out.println(Arrays.toString(nums2));
    }

    private static int @NotNull [] generateRandomArray3() {
        java.util.Random random3 = new java.util.Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random3.nextInt(5) + 1;
        }
        return arr;
    }


    private static void task3() {
        System.out.println("Задача 3");
        int[] nums = generateRandomArray3();
        int[] nums2 = generateRandomArray3();
        int sum = 0;
        int sum2 = 0;
        for (int num : nums) {
            sum = sum + num;
        }
        System.out.println(Arrays.toString(nums));
        float middleAverage = (float) sum / nums.length;
        System.out.println(middleAverage);
        for (int j : nums2) {
            sum2 = sum2 + j;
        }
        System.out.println(Arrays.toString(nums2));
        float middleAverage2 = (float) sum2 / nums2.length;
        System.out.println(middleAverage2);
        if (middleAverage > middleAverage2) {
            System.out.println("Среднеарифметическое первого массива больше");
        } else if (middleAverage2 > middleAverage) {
            System.out.println("Среднеарифметическое второго массива больше");
        } else {
            System.out.println("Среднеарифметические массивов равны");
        }
    }

    private static void task4() {
        System.out.println("Задача 4");
    }

    private static void task5() {
        System.out.println("Задача 5");
    }

    private static void task6() {
        System.out.println("Задача 6");
    }
}
