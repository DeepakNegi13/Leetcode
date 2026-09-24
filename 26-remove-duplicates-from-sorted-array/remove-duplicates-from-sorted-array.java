class Solution {
    public int removeDuplicates(int[] arr) {
        if (arr.length == 1)
            return 1;
        int i = 0;
        int j = 1;
        while (j < arr.length) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
            j++;
        }
        return i+1;
    }
}