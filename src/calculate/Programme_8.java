package calculate;

import java.util.HashSet;

public class Programme_8 {
    public static void main(String[] args) {
        HashSet<Integer>number =new HashSet<>();
        number.add(4);
        number.add(7);
        number.add(8);
        for (int i =1; i <10; i++){
            if (number.contains(i)){
                System.out.println(i +"was found in the set. ");
            }else{
                System.out.println(i +"was not found int the set ");
            }
        }

    }
}
