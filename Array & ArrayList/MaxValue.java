public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,4};
        System.out.println(max_item(arr));
    }

    static int max_item(int[] arr){
        if(arr.length==0){
            return -1;
        }
        
        int mx = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>mx){
                mx = arr[i];
            }
        }
        return mx;
    }
}
