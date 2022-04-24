package arrayslist_intro;

import java.util.Arrays;

public class BasicArrays {

    public static void main(String[] args) {

        //simple int array
//        int[] nums = {1,2,3,4,5};

//        System.out.println(Arrays.toString(nums));

//        for(int i = 0; i < nums.length; i++){
//            System.out.print(nums[i] + " ");
//        }


        int[] nums = new int[100];

        nums[0] = 100;
        nums[1] = 101;
        nums[2] = 102;
        nums[3] = 103;
        nums[4] = 104;


        int[] nums2 = new int[nums.length + 1]; //6
        nums2[0] = nums[0]; //100
        nums2[1] = nums[1]; //101
        nums2[2] = nums[2];
        nums2[3] = nums[3];
        nums2[4] = nums[4]; //104
        nums2[5] = 105;



        int[] nums3 = new int[nums2.length + 3];


        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums2));






    }
}
