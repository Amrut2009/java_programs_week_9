package calculate;

import java.util.ArrayList;

// Write a Java program to test an array list is empty or not. Define array list with underground tube names
public class Programme_7 {
    public static void main(String[] args) {


        ArrayList<String> tubeList = new ArrayList<>();
        tubeList.add("Metropilitan Line");
        tubeList.add(" Picadily  Line");
        tubeList.add("Elizabeth Line");
        tubeList.add("Norther Line");
        tubeList.add("jubilee Line");
        tubeList.add(" Victoria Line");
        System.out.println("Original array List:" + tubeList);
        System.out.println("Checking the above array list is empty or not !" + tubeList.isEmpty());
        tubeList.removeAll(tubeList);
        System.out.println("Array list after remove all elements"+ tubeList);
        System.out.println("Checking the above array list is empty or not !" +tubeList);

}
}
