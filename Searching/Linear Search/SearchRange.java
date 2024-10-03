public class SearchRange {
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,4,7,6};
        int target = 7;
        int result = linearSearch(arr, target, 1, 5);
        System.out.println(result);
    }

    static int linearSearch(int[] arr, int target, int begin, int end){
        if(arr.length==0){
            return -1;
        }
        
        for(int i=begin; i<=end; i++){
            int element = arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }
}
