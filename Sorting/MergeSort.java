import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2};
        arr = mergeSort(arr);
        //mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second){
        int[] tmp = new int[first.length + second.length];
        int i=0;
        int j=0;
        int k=0;

        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                tmp[k] = first[i];
                i++;
            }
            else{
                tmp[k] = second[j];
                j++;
            }
            k++;
        }

        while(i<first.length){
            tmp[k] = first[i];
            i++;
            k++;
        }
        while(j<second.length){
            tmp[k] = second[j];
            j++;
            k++;
        }
        
        return tmp;
    }





    

    static void mergeSortInPlace(int[] arr, int s, int e){
        if(e-s==1){
            return;
        }
        int mid = (s+e)/2;
        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);
        mergeSortInPlace(arr, s, mid, e);
    }

    static void mergeSortInPlace(int[] arr, int s, int m, int e){
        int[] tmp = new int[e-s];
        int i=0;
        int j=0;
        int k=0;

        while(i<m && j<e){
            if(arr[i]<arr[j]){
                tmp[k] = arr[i];
                i++;
            }
            else{
                tmp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<m){
            tmp[k] = arr[i];
            i++;
            k++;
        }
        while(j<e){
            tmp[k] = arr[j];
            j++;
            k++;
        }
        
        for(int l=0; l<tmp.length; l++){
            arr[s+l] = tmp[l];
        }
    }
}
