package cn.wx.snian;

import java.util.HashSet;
import java.util.Set;

/**
 *找出数组中重复的数字
 */
public class Offer03 {

    public static int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int repeat = -1;
        for (int num : nums)  {
            if(!set.add(num)){
                repeat = num;
                break;
            }
        }
        return repeat;
    }

    public static void main(String[] args) {
        int [] nums = {1,3,2,3,4,5,9};
        int a = findRepeatNumber(nums);
        System.out.println(a);
    }
}
