package fast.slow.pointers;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7,10};

        int slow = 0, fast =1;

        for (int i = 0; i < nums.length; i++) {
            slow =i+1;
            fast = i+2;
            while (fast < nums.length) {

                if(nums[i]==fast || nums[i] ==slow) {
                    System.out.println("Duplicate found");
                    return;
                }
            }
        }
    }
}
