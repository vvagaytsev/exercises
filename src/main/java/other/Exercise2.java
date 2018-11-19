package other;

/**
 * @author Vladimir Vagaytsev
 * Date: 08/11/2018
 */
public final class Exercise2 {

    private Exercise2() {
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int targetSum = 7;
        boolean result = analyse0(array, targetSum);
        System.out.println(result);
    }

    private static boolean analyse(int[] array, int targetSum) {
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                if (sum == targetSum) {
                    System.out.println("Last position: " + j);
                    System.out.println("Last element: " + array[j]);
                    return true;
                }
                if (sum > targetSum) {
                    break;
                }
            }
        }
        return false;
    }

    private static boolean analyse0(int[] array, int targetSum) {
        int sum = 0;
        int start = 0;
        int cur = 0;
        while (cur < array.length) {
            sum += array[cur];
            if (sum == targetSum) {
                return true;
            }
            if (sum > targetSum) {
                sum -= array[cur]; // remove last added element which caused overflow
                cur--; // step 1 position back
                sum -= array[start]; // change sum to next partial sum
                start++; // shift the start index to the right to continue calculating next partial sum
            }
            cur++;
        }
        return false;
    }
}