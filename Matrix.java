import java.util.Arrays;

public class Matrix
{
    public static void main(String[] args)
    {
        Matrix newArray = new Matrix();
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[] ans = MatrixSearch(arr, 8);
        
        System.out.println(Arrays.toString(ans));
    }
    
    static int[] MatrixSearch(int[][] arr, int key)
    {
        int row = arr.length;
        int col = arr[0].length;
        int l = 0;
        int h = row * col - 1;
 
        while (l <= h) 
        {
            int mid = l + (h - l) / 2;
 
            int tC = mid % col;
            int tR = mid / col;
            int val = arr[tR][tC];
            
            if (val == key)
            {
                return new int[] { tR, tC };
            }
 
            if (val < key)
            {
                l = mid + 1;
            }
            else
            {
                h = mid - 1;
            }
        }
 
        return new int[] { -1, -1 };

    }
}