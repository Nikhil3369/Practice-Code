
import java.util.ArrayList;
import java.util.Arrays;

public class Array_Sort {
    public static void main(String[] args) {

        int arr[] = {12, 5, 1, 1, 4, 1};
        int n = arr.length;
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        Arrays.sort(arr);
        int count =0 ;
        int max = arr[n-1];
        for (int a:arr)
              {
                  if(a == max )
                  {
                      n = n-1;

                  }
              }
        System.out.println(arr[n-1]);


    }

}
