package arrayslist_intro;

import java.util.ArrayList;
import java.util.List;

public class CodingChallenge {

    public static void main(String[] args) {


        int[] nums1 = {1,2,3,4,5,7,8,9};
        int[] nums2 = {4,5,6,7};

        List<Integer> list = new ArrayList<>();

        int times = nums1.length + nums2.length; //9

        int i = 0, j = 0;
        while (  i < nums1.length || j < nums2.length  ){
            if (i < nums1.length){
                list.add( nums1[i]);
                i++;
            }
            if (j < nums2.length){
                list.add(nums2[j]);
                j++;
            }
        }

        System.out.println(list);



        /// [1,3,4,6,2,3,4,5,6,2,4]
    }
}
