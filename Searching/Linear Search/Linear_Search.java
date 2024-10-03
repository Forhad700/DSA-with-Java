public class Linear_Search{
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,4};
        int target = 5;
        int result = linearSearch(arr, target);
        
        //boolean result = linearSearch2(arr, target);
        System.out.println(result);
    }

    static int linearSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        
        for(int i=0; i<arr.length; i++){
            int element = arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }

    static boolean linearSearch2(int[] arr, int target){
        if(arr.length==0){
            return false;
        }

        for(int i=0; i<arr.length; i++){
            int element = arr[i];
            if(element==target){
                return true;
            }
        }
        return false;
    }
}