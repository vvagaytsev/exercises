package other;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Vladimir Vagaytsev
 * Date: 08/11/2018
 */
public final class Exercise1 {

    private Exercise1() {
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 1, 3, 2, 5};
        int[] uniques = findUniques(array);
        System.out.println(Arrays.toString(uniques));
    }

    private static int[] findUniques(int[] array) {
        Set<Integer> uniqueSet = new LinkedHashSet<>();
        for (Integer i : array) {
            if (!uniqueSet.contains(i)) {
                uniqueSet.add(i);
            } else {
                uniqueSet.remove(i);
            }
        }
        return uniqueSet.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}