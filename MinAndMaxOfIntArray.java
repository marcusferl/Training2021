import java.util.Arrays;


public class MinAndMaxOfIntArray {
 
    
    public static void main(String[] args) {
        int [] test = {1,2,3,4,5};

        minMax(test);
    }

    public static int[] minMax(int[] arr) {

        int[] minMax = new int[2];
       Arrays.sort(arr);

       minMax [0] = arr[0];
       minMax [1] = arr[arr.length -1];
        
       for (int i = 0; i < minMax.length; i++) {
          System.out.println(minMax[i]); 
       }
        
        return minMax;
    }
}
