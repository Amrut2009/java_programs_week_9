package calculate;

import java.util.Arrays;

public class Programme_3 {
    public static void main(String[] args) {

        int []my_Array ={1,2,3,4,5,6,7,8,9};
        System.out.println("Original Array :"+ Arrays.toString(my_Array));
        for (int i =my_Array.length -1;i>0;i-- ){

            System.out.println(my_Array[i]+"");
        }
        System.out.println("Reverse Array:" +Arrays.toString(my_Array));


    }
}
