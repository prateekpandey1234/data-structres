import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int len = nums.length;;
        for(int i=0;i<len;i++){
            for(int j=len;j>i;j--){
                int[] arr2 = Arrays.copyOfRange(nums,i,j);
                int sum = IntStream.of(arr2).sum();
                if(sum>max){
                    max=sum;
                }
            }
        }return max;
    }
}
public class practice{
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] num2 = {1,2};
        int ans = sol.maxSubArray(num2);
        System.out.println(ans);
    }
}