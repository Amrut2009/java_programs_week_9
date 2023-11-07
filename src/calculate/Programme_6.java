package calculate;

import java.util.ArrayList;

public class Programme_6 {
    public static void main(String[] args) {
        ArrayList<String>List =new ArrayList<>();
        List.add("Maths");
        List.add("Science");
        List.add("Physics");
        List.add("Chemistry");
        List.add("Psychology");
        System.out.println("Subject Name :" +List);

        String element =List.get(2);
        System.out.println("Third element :" + element);
        element =List.get(3);
        System.out.println("Foirth elements:" + element);
    }

}
