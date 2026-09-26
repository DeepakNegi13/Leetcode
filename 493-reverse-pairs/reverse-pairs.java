class Solution {
    public static void inverse(int[] arr, int[] count) {
        int n = arr.length;
        if (n == 1)
            return;
        int[] arr1 = new int[n / 2];
        for (int i = 0; i < n / 2; i++)
            arr1[i] = arr[i];
        int[] arr2 = new int[n - n / 2];
        for (int i = 0; i < n - n / 2; i++)
            arr2[i] = arr[n / 2 + i];
        inverse(arr1, count);
        inverse(arr2, count);
        counting(arr1, arr2, arr, count);
    }

    public static int inversionCount(int arr[]) {
        int[] count = { 0 };
        inverse(arr, count);
        return count[0];
    }

    public static void counting(int[] arr1, int[] arr2, int[] arr, int[] count) {
        int i = 0;
        int j = 0;
        int num = 0;
        while (i < arr1.length) {

            while (j < arr2.length && (long) arr1[i] > (long) 2 * arr2[j]) {
                num++;
                j++;
            }

            count[0] += num;
            i++;
        }
        //merge the sorted array;
        int l = 0;
        int m = 0;
        int n = 0;
        while (l < arr1.length && m < arr2.length) {
            if (arr1[l] <= arr2[m]) {
                arr[n] = arr1[l];
                l++;
                n++;
            } else {
                arr[n] = arr2[m];
                m++;
                n++;
            }
        }
        if (l == arr1.length) {
            while (m < arr2.length) {
                arr[n] = arr2[m];
                m++;
                n++;
            }
        }
        if (m == arr2.length) {
            while (l < arr1.length) {
                arr[n] = arr1[l];
                l++;
                n++;
            }
        }
    }

    public int reversePairs(int[] nums) {
        return inversionCount(nums);
    }
}