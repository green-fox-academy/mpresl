public class MaximumFinder {
    public static void main(String[] args) {
        int[] numbers = {1,6,5,7,33,13,8};
        int size = numbers.length;

        System.out.println(findMax(numbers, size));

    }
    public static int findMax(int[] nums, int len){
        if (len == 1){
            return nums[0];
        }
        return Math.max(nums[len-1], findMax(nums, len-1));
    }
}
