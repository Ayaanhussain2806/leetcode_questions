// Last updated: 8/7/2025, 11:39:22 AM
public class Next_Permutation {

    // time: O(N^2)
    // space: O(1)
    public class Solution {

        public void nextPermutation(int[] nums) {

            if (nums == null || nums.length == 0) {
                return;
            }

            for (int i = nums.length - 2; i >= 0; --i) { 
                if (nums[i] < nums[i + 1]) { 
                    for (int j = nums.length - 1; j > i; --j) {
                        if (nums[j] > nums[i]) {
                            swap(nums, i, j); 

                            reverse(nums, i + 1, nums.length - 1); 
                            return;
                        }
                    }

                }
            }

            reverse(nums, 0, nums.length - 1);
        }

        private void swap(int[] nums, int i, int j) {

            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;

        }

        private void reverse(int[] nums, int i, int j) {

            while (i < j) {

                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;

                i++;
                j--;
            }
        }
    }
}


class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;
        for (; i >= 0; --i) {
            if (nums[i] < nums[i + 1]) {
                break;
            }
        }
        if (i >= 0) {
            for (int j = n - 1; j > i; --j) {
                if (nums[j] > nums[i]) {
                    swap(nums, i, j);
                    break;
                }
            }
        }

        for (int j = i + 1, k = n - 1; j < k; ++j, --k) {
            swap(nums, j, k);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[j];
        nums[j] = nums[i];
        nums[i] = t;
    }
}