import java.util.Arrays;
public class Masti{
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};
        rotate(arr,3);
    }
    public static void rotate(int[] nums, int k){
        int j = 0;
        int n = nums.length - 1;
        for(int  i = n ; i > n -k; i--){
            int temp = nums[n];
            for(int t = n-1; t>-1; t--){
                nums[t+1] = nums[t];
            }


            nums[0] = temp;
            }
        System.out.println(Arrays.toString(nums));

    }

}

