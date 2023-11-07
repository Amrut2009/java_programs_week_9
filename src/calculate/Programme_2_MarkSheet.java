package calculate;

import java.util.Scanner;

public class Programme_2_MarkSheet {
    public static void main(String[] args) {
        int A_grade =0;
        int b_grade =0;
        int c_grade =0;
        int d_grade =0;
        int f_grade =0;
        int count =0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter exam score as integer percentage in range 0 to 100");
        int score = in.nextInt();
        while (score>0){
            count ++;
            if(score>=90 && score<=100)
                A_grade++;
            else if (score>=80 && score <=89)
                b_grade++;
            else if (score>=70 && score <=79)
                c_grade++;
            else if (score>=60 && score<=69)
                d_grade++;
            else if (score>=50 && score <=59)
                f_grade++;
            System.out.println("Enter exam score as integer percentage in range 0 to 100");
            score =in.nextInt();
            System.out.println("Total number of grade  : + count");
            System.out.println("Total number of A grades :"+ A_grade);
            System.out.println("Total number of B grades :"+ b_grade);
            System.out.println("Total number of A grades :"+ c_grade);
            System.out.println("Total number of B grades :"+ d_grade);
            System.out.println("Total number of A grades :"+ f_grade);

            }
        }

    }

