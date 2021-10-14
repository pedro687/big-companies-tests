import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicatesIndices {
    //Used by google to interviews
    public static void main(String[] args) {
        Integer[] vector = {1, 2, 3, 2, 3};

        System.out.println(func_1(vector));
        System.out.println(func_2(vector));
    }

    private static Integer func_1(Integer[] vector) {
        var num = -1;

        // O(N²)
        for (int i = 0; i < vector.length; i++) {
            for (int j = i+1; j < vector.length; j++) {
                if (vector[i] == vector[j]) {
                    if (num == -1  || j < num) {
                        num = j;
                    }
                }
            }
        }

        return num;
    }

    //O(logN) -> + fast
    private static Integer func_2(Integer[] vector) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < vector.length; i++) {
            if (set.contains(vector[i])) {
                return i;
            }
            set.add(vector[i]);
        }

        return -1;
    }
}
