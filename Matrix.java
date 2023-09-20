import java.util.Arrays;

public class Matrix
{
    public static void main(String[] args)
    {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        //create an array full of the correct matrix coordinates
        int[] answer = MatrixSearch(arr, 8);
        //print out the answer as a string
        System.out.println(Arrays.toString(answer));
    }
    
    static int[] MatrixSearch(int[][] arr, int key)
    {
        int row = arr.length;
        int col = arr[0].length;
        int l = 0;
        //determine the number of spots in the matrix
        int h = row * col - 1;
 
        while (l <= h) 
        {
            //find the middle of the matrix
            int mid = l + (h - l) / 2;
 
            int tC = mid % col;
            int tR = mid / col;
            int val = arr[tR][tC];
            
            if (val == key)
            {
                //return the coordinates of the matrix in which the key is found
                return new int[] { tR, tC };
            }
             // check to see if the current value is less than the target number
            if (val < key)
            {
                l = mid + 1;
            }
             // check to see if the current value is higher than the target number

            else
            {
                h = mid - 1;
            }
        }
 
        return new int[] { -1, -1 };

    }
}
