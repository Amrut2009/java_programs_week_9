package calculate;

import java.util.HashMap;
import java.util.Map;

public class Programme_9 {
    public static void main(String[] args) {
        Map<String,Integer>List =new HashMap<>();
        List.put("John ",32);
        List.put("Jiya " ,15);
        List.put("Kiran ",40);
        List.put("Nick ",42);
        for (Map.Entry<String,Integer>personage:List.entrySet()){
            System.out.println(personage);

        }
    }

}
