import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] numbers = {0 ,5, 11, 1, 3, 8, 4, 2, 22, 9};
        int[] numbers2 = {1, 2, 3, 4};

        System.out.println("Result: " + Arrays.toString(doSorting(numbers)));;
        System.out.println("---");;
        System.out.println("Result: " + Arrays.toString(doSorting(numbers2)));;
    }

    private static int[] doSorting(int[] numbers) {
        int length = numbers.length;
        boolean isSwap = false;
        int[] result = Arrays.copyOf(numbers, numbers.length);

        for (int i = 0; i < length - 1; i++) {
            System.out.println("Pass " + (i + 1) + " starting: " + Arrays.toString(numbers));
            for (int j = 0 ; j < length - 1; j++) {
                if (result[j] > result[j + 1]) { // bandingkan dengan index selanjutnya
                    int temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                    isSwap = true;
                    System.out.println("\tswap -> " + Arrays.toString(result));
                } else System.out.println("\tno swap -> " + Arrays.toString(result));
            }

            if (!isSwap) {
                System.out.println("array is sorted");
                break;
            } else {
                System.out.println("End of pass " + (i + 1) + ": " + Arrays.toString(result));
            }
        }

        return result;
    }
}
