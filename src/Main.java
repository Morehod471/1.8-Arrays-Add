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

    private static int [] generateRandomArray(int a, int a1, int a2) {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(a2-a1) + a1;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] nums = generateRandomArray(15,0,99);
        int sum = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                sum++;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(sum);
    }

    private static void task2() {
        System.out.println("Задача 2");
        int[] nums = generateRandomArray(8, 1, 10);
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < 8; i++) {
            if (i % 2 != 0) {
                nums[i] = 0;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    private static void task3() {
        System.out.println("Задача 3");
        int arraysize = 5;
        int[] nums = generateRandomArray(arraysize, 0, 5);
        int[] nums2 = generateRandomArray(arraysize, 0, 5);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums2));
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < arraysize; i++) {
            sum = sum + nums[i];
            sum2 = sum2 + nums2[i];
        }
        float middleAverage = (float) sum / nums.length;
        System.out.println(middleAverage);
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
        int[] nums = generateRandomArray(4, 10, 99);
        System.out.println(Arrays.toString(nums));
        int check = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] < nums[i + 1]) {
                check = check + 1;
            }
        }
        if (check == nums.length - 1) {
            System.out.println("Массив является строго возрастающей последовательностью");
        }
    }

    private static void task5() {
        System.out.println("Задача 5");
        int[] fibonacciArray = new int[20];
        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;
        for (int i = 0; i < fibonacciArray.length-2; i++) {
            fibonacciArray[i + 2] = fibonacciArray[i+1] + fibonacciArray[i];
        }
        System.out.println(Arrays.toString(fibonacciArray));
    }

    private static void task6() {
        System.out.println("Задача 6");
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (i + 1) * (i + 1);
        }
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (i + 1) * (i + 1);
            if (i % 2 != 0) {
                nums[i] = -nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            nums[i] = 1;
            if (i % 2 != 0) {
                nums[i] = -nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (i + 2)/2;
            if (i % 2 != 0) {
                nums[i] = 0;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
