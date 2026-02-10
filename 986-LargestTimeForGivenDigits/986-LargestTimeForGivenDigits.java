// Last updated: 2/10/2026, 3:14:28 PM
class Solution {
    public String largestTimeFromDigits(int[] arr) {

        int maxTime = -1;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == i) continue;

                for (int k = 0; k < 4; k++) {
                    if (k == i || k == j) continue;

                    int l = 6 - i - j - k; 

                    int hour = arr[i] * 10 + arr[j];
                    int min  = arr[k] * 10 + arr[l];

                    if (hour < 24 && min < 60) {
                        maxTime = Math.max(maxTime, hour * 60 + min);
                    }
                }
            }
        }

        if (maxTime == -1) return "";

        int hour = maxTime / 60;
        int min  = maxTime % 60;

        return String.format("%02d:%02d", hour, min);
    }
}
