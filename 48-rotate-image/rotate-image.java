class Solution {
    public void rotate(int[][] arr) {
        int i =0;
        int j =-1;
        while (i<arr[0].length){
            j++;
            int k = j;
            while (k<arr.length){
                int temp = arr[i][k];
                arr[i][k]=arr[k][i];
                arr[k][i]=temp;
                k++;
            }
            i++;
        }
        for(int m = 0;m<arr.length;m++){
            for(int n = 0;n<arr.length/2;n++){
                int temp = arr[m][n];
                arr[m][n]=arr[m][arr.length-1-n];
                arr[m][arr.length-1-n]=temp;
            }
        }
       
    }
}