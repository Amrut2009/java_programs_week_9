package calculate;
//Declare all method instance method with no return with perameters

public class Calculator {
    public void addition(int a, int b){
        int result =a+b;
        System.out.println(result);
    }
    public void subtraction (int a, int b ){
        int result = a-b;
        System.out.println(result);
    }
    public void division (int a, int b ){
        int result =a/b;
        System.out.println(result);
    }
    public void multiplication (int a , int b){
        int result =a*b;
        System.out.println(result );
    }
    public void calculateResult(int a,int b ,char symbol){
        switch (symbol){
            case'+':
                addition(a,b);
                break;
            case'-':
                subtraction(a,b);
                break;
            case '/':
                division(a,b);
                break;
            case'*':
                multiplication(a,b);
                break;
            default:
                System.out.println("invalid Input");

        }
    }

}
