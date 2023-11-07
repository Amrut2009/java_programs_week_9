package calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator c1 =new Calculator();
        char symbol1 = 0;
        int a,b;
        Scanner s1=new Scanner(System.in);
        do{
            System.out.println("Please Enter first number");
            a =s1.nextInt();
            System.out.println("Please Enter second Number");
            b =s1.nextInt();
            System.out.println("Choose an operator +,-,*,/");
            char symbol =s1.next().charAt(0);
            c1.calculateResult(a,b, symbol);
            System.out.println("Would you like to do more calculation Please enter 'y'  'n' ");
            symbol=s1.next().charAt(0);

        }while(symbol1 =='y');
        s1.close();


    }

}
