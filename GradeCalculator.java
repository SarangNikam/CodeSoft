import java.util.*;

public class GradeCalculator {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the obtained marks out of 100:");
        System.out.println("Physics:");
        int m1=sc.nextInt();
        System.out.println("Chemistry:");
        int m2=sc.nextInt();
        System.out.println("Mathematics:");
        int m3=sc.nextInt();
        System.out.println("English:");
        int m4=sc.nextInt();
        System.out.println("Marathi:");
        int m5=sc.nextInt();
       
        float percentage=(float)(m1+m2+m3+m4+m5)/5;
        
        System.out.println("Percentage:"+percentage);
        String grade;
        if(percentage>=75){
            grade="First class with Distinction ";
        }else if(percentage<75 && percentage>=60){
            grade="First class";
        }else if(percentage<60 && percentage>=35){
            grade="Pass";
        }else{
            grade="Fail";
        }
        System.out.println("Grade:"+grade);


    }
}
