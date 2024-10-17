package ad231.hihlo;

public class Main {

    // task 1
    public static boolean isNonDecreasing(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    // task 2
    public static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    // task 3
    public static boolean canBeSplit(int[] array) {
        int totalSum = 0;
        for (int num : array) {
            totalSum += num;
        }

        if (totalSum % 2 != 0) {
            return false;
        }

        int halfSum = 0;
        for (int num : array) {
            halfSum += num;
            if (halfSum == totalSum / 2) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // 1. массив возрастания
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {3, 3, 3, 3};
        int[] array3 = {4, 3, 2, 1};
        System.out.println("Larger than the last one: " + isNonDecreasing(array1));  // true
        System.out.println("Equal to the previous: " + isNonDecreasing(array2));  // true
        System.out.println("Smaller than the previous: " + isNonDecreasing(array3));  // false

        // 2. fizzbuzz
        fizzBuzz();

        // 3. массив на части
        int[] array4 = {2, 2, 2, 4, 2}; //ttrue
        int[] array5 = {2, 3, 6, 4, 2}; //false
        int[] array6 = {20, 20}; //true
        System.out.println("Can divide it into parts: " + canBeSplit(array4));  // true
        System.out.println("can't be divided into parts:: " + canBeSplit(array5));  // false
        System.out.println("Can divide it into parts: " + canBeSplit(array6));  // true
    }
}
