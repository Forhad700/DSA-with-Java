public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 3;
        System.out.println(binarySearch(arr, target));
    }

    static int binarySearch(int[] arr, int target){
        int l = 0;
        int r = arr.length-1;
        while(l<=r){
            int mid = l + (r-l) / 2;
            if(target<arr[mid]){
                r = mid-1;
            }
            else if(target>arr[mid]){
                l = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}