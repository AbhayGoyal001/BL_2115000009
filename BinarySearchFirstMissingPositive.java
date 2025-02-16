import java.util.Arrays;

public class FirstMissingPositive {
    public static int BinarySearchfirstMissingPositive(int[] nums) {
        // Step 1: Remove negatives & sort
        Arrays.sort(nums);

        int left = 0, right = nums.length - 1;
        int expected = 1;

        // Step 2: Binary Search for missing positive
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < expected) {
                left = mid + 1; // Move right
            } else if (nums[mid] == expected) {
                expected++; // Move to next expected number
                left = mid + 1;
            } else {
                right = mid - 1; // Move left
            }
        }

        return expected;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        System.out.println(firstMissingPositive(nums)); // Output: 2

        int[] nums2 = {1, 2, 0};
        System.out.println(firstMissingPositive(nums2)); // Output: 3
    }
}
