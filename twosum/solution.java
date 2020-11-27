package twosum;
import java.util.ArrayList;
import java.util.Arrays;


public class solution {

    static int[] twosum(int[] nums, int target){
        int[] result = new int[2];
        int a = 0;
        int b = 0;
        for (int i : nums) {
            a++;
            for (int j : nums) {
                b++;
                if (i + j == target && a != b) {
                    result[0] = b-1;
                    result[1] = a-1;
                }
            }
            b = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] solution = twosum(new int[] {3, 3}, 6);
        System.out.println(Arrays.toString(solution));
    }

}