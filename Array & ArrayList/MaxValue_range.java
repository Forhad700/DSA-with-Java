public class MaxValue_range {
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,4,7,8};
        System.out.println(max_item(arr, 2, 5));
    }

    static int max_item(int[] arr, int begin, int end){
        if(arr==null){
            return -1;
        }
        
        int mx = arr[0];
        for(int i=begin; i<=end; i++){
            if(arr[i]>mx){
                mx = arr[i];
            }
        }
        return mx;
    }
}
