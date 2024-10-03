import java.util.Arrays;
public class SearchElement_Sorted_2DMatrix{
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr, 9)));
    }

    static int[] binarySearch(int[][] matrix, int r, int cStart, int cEnd, int target){
        while(cStart<=cEnd){
            int mid = cStart+(cEnd-cStart)/2;
            if(target==matrix[r][mid]){
                return new int[] {r,mid};
            }
            if(target>matrix[r][mid]){
                cStart = mid+1;
            }
            else{
                cEnd = mid-1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] search(int[][] matrix, int target){
        int r = matrix.length;
        int c = matrix[0].length;
        if(r==1){
            return binarySearch(matrix, 0, 0, c-1, target);
        }
        int rStart = 0;
        int rEnd = r-1;
        int cMid = c/2;
        while(rStart<(rEnd-1)){
            int mid = rStart+(rEnd-rStart)/2;
            if(target==matrix[mid][cMid]){
                return new int[]{mid,cMid};
            }
            if(target>matrix[mid][cMid]){
                rStart = mid;
            }
            else{
                rEnd = mid;
            }
            if(target==matrix[rStart][cMid]){
                return new int[]{rStart,cMid};
            }
            if(target==matrix[rStart+1][cMid]){
                return new int[]{rStart+1,cMid};
            }

            if(target<=matrix[rStart][cMid-1]){
                return binarySearch(matrix, rStart, 0, cMid-1, target);
            }
            if(target>=matrix[rStart][cMid+1] && target<=matrix[rStart][c-1]){
                return binarySearch(matrix, rStart, cMid+1, c-1, target);
            }
            if(target<=matrix[rStart+1][cMid-1]){
                return binarySearch(matrix, rStart+1, 0, cMid-1, target);
            }
            else{
                return binarySearch(matrix, rStart+1, cMid+1, c-1, target);
            }
        }
        return new int[]{-1,-1};
    }
}