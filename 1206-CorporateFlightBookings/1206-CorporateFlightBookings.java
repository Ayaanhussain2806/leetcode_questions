// Last updated: 2/10/2026, 3:14:03 PM
class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] arr = new int[n];

        for (int[] booking : bookings) {
            int first = booking[0];
            int last = booking[1];
            int seats = booking[2];

            arr[first - 1] += seats; 

            if (last < n) {           
                arr[last] -= seats;
            }
        }

      
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];
        }

        return arr;
    }
}
