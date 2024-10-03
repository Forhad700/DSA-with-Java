public class Floor_number {
    public static void main(String[] args){
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(floorNum(arr, target));
    }

    static int floorNum(int[] arr, int target){
        int l = 0;
        int r = arr.length-1;
        if(target<arr[l]){
            return -1;
        }
        while(l<=r){
            int mid = l+(r-l)/2;
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
        return r;
    }
}
