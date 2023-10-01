package array;

import java.util.Arrays;

public class ReplaceElements {

    public  static int[] replaceElements(int[] arr) {
        //[17,18,5,4,6,1]
        int ln=arr.length-1;//5
        int lg=arr[ln];//1
        arr[ln]=-1; //[17,18,5,4,6,-1]
        int i=ln-1; //4
        while(i>=0) //4 //3 //2
        {   int tmp=arr[i]; // 6 //4 //5
            arr[i]=lg;// [17,18,5,4,6,-1] // [17,18,5,6,6,-1] //
            if(lg<tmp) // 6 < 6 // 6<4
                lg=tmp; // 4
            i--;
        }
        return arr;
    }

    public static void main(String[] args) {
        Arrays.stream(replaceElements(new int[]{17, 18, 5, 4, 6, 1})).forEach(w -> System.out.println(w));
    }
}
