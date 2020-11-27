package twosum;

import java.util.Arrays;
import java.util.HashMap;

public class solution2 {
    static int[] twosum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int toFind = target - nums[i];
            if (hashMap.containsKey(toFind) && hashMap.get(toFind) != i){
                result[0] = hashMap.get(toFind);
                result[1] = i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] solution = twosum(new int[]{3,3}, 6);
        System.out.println(Arrays.toString(solution));
    }
}
