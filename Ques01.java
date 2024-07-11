import java.util.Arrays;

public class Ques01 {
    public static void main(String[] args) {

        //Search in the 2D sorted array is the more efficient way tc = O(N)

        int[][] nums = {{12, 23, 34},
                        {13, 24, 45},
                        {14, 26, 78}};

        System.out.println(Arrays.toString(search2D(nums,43)));

    }
    static int[] search2D(int arr[][], int target){

       int r = 0;
       int c = arr.length - 1;

       while(r < arr.length && c >= 0){

           if(target == arr[r][c]){
               return new int[] {r, c};
           } else if (target > arr[r][c]) {
               r++;
           } else if (target < arr[r][c]) {
               c--;
           }

       }


        return new int[] {-1,-1};
    }
}
