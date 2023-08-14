package leetCode.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode1389 {
    public static void main(String[] args) {
        int nums[] = new int[]{0,1,2,3,4};    
        int index[] = new int[]{0,1,2,2,1};
        int[] result = createTargetArray(nums, index);    
        System.out.println(Arrays.toString(result));
    }

    static int[] createTargetArray(int [] nums, int [] index){
        List<Integer> target = new ArrayList<Integer>();
        int[] ans = new int[nums.length];
        for(int i =0; i< nums.length; i++){
            target.add(index[i],nums[i]);
        }
        for(int i =0; i < target.size(); i++){
            ans[i] = target.get(i);
        }
        return ans;
    }
}
