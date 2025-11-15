// Last updated: 11/15/2025, 10:17:12 PM
class Solution {


    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[nums2.length];

        // Step 1: Find NGE for nums2 (exactly same logic as your NGE(arr))
        for (int i = 0; i < nums2.length; i++) {
            while (!st.isEmpty() && nums2[i] > nums2[st.peek()]) {
                nge[st.pop()] = nums2[i];
            }
            st.push(i);
        }

        // Step 2: For remaining indexes, no greater element exists
        while (!st.isEmpty()) {
            nge[st.pop()] = -1;
        }

        // Step 3: For nums1, find index in nums2 and print its NGE
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = -1; // default value
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    res[i] = nge[j];
                    break;
                }
            }
        }

        return res;
    }
}

