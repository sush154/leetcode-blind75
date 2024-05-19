public class Main {
    public static void main(String[] args) {

        int[] nums = new int[]{1,2,3,4};

        int len = nums.length;
        int currentIndex = 0;
        int[] output = new int[nums.length];
        int[] leftProduct = new int[nums.length];
        int rightProduct = 1;

        leftProduct[0] = 1;
        for (int i = 1; i < len; i++) {
            leftProduct[i] = leftProduct[i-1] * nums[i-1];
        }

        for (int i = len - 1; i >= 0; i--) {
            output[i] = leftProduct[i] * rightProduct;
            rightProduct = rightProduct * nums[i];
        }
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
}