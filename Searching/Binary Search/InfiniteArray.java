public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target){
        int l = 0;
        int r = 1;
        while(target>arr[r]){
            int tmp = r + 1;
            r = r + (r - l + 1) * 2;
            l = tmp;
        }
        return binarySearch(arr, target, l, r);
    }

    static int binarySearch(int[] arr, int target, int l, int r){
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
