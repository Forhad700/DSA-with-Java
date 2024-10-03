public class FindMinimum {
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,4,7,6};
        System.out.println(findMin(arr));
    }

    static int findMin(int[] arr){
        int mn = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<mn){
                mn = arr[i];
            }
        }
        return mn;
    }
}
