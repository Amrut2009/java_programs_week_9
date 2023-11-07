package calculate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Programme_10 {
   String[]zone1={"oxford Circus","Green Park" ,"Euston Square", "Bond Street"};
   String[]JubileeLine =new String[]{"Green Park","Bond Street"};
   String[]Metropolitanline =new String[]{"Euston Square"};
   String[]CentralLine =new String[]{"Oxford Circus","Bond Street"};

    public static void main(String[] args) {
        Programme_10 obj =new Programme_10();
        boolean found =false;
        for(String sname :obj.zone1){
            System.out.println(sname);
        }
        System.out.println();
        Scanner read =new Scanner(System.in);
        System.out.println("Enter London Zone 1 Station:");
        String Station =read.nextLine().toLowerCase();
        read.close();
        System.out.println(Station);

        List<String>namelist =new ArrayList<>(Arrays.asList(obj.JubileeLine));
        if (namelist.contains(Station)) {
            System.out.println("Station found on JublieeLine ");
            found = true;
        }
            namelist=new ArrayList<>(Arrays.asList(obj.Metropolitanline));
            if (namelist.contains(Station)){
                System.out.println("Station found on JublieeLine");
                found =true;
            }
            namelist =new ArrayList<>(Arrays.asList(obj.CentralLine));
            if (namelist.contains(Station)){
                System.out.println("Station found on JublieeLine");
                found=true;
                

        }

    }
}
