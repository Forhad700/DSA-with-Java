public class MaxSum_Wealth {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {2,4,3},
            {3,1,4}
        };
        int result = findMaxSum(arr);
        System.out.println(result);
    }

    static int findMaxSum(int[][] arr){
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int rsum = 0;
            for(int j=0; j<arr[i].length; j++){
                rsum += arr[i][j];
            }
            if(rsum>maxSum){
                maxSum = rsum;
            }
        }
        return maxSum;
    }

    // static int findMaxSum(int[][] arr){
    //     int maxSum = Integer.MIN_VALUE;
    //     for(int[] numi : arr){
    //         int rsum = 0;
    //         for(int numj : numi){
    //             rsum += numj;
    //         }
    //         if(rsum>maxSum){
    //             maxSum = rsum;
    //         }
    //     }
    //     return maxSum;
    // }
}
