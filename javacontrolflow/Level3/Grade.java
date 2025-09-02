package Level3;
import java.util.*;
public class Grade{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of Physic:");
        int p=sc.nextInt();
        System.out.println("Enter marks of Chemistry:");
        int c=sc.nextInt();
        System.out.println("Enter marks of Maths:");
        int m=sc.nextInt();
        double per=(p+c+m)/3;
        if(per>=80){
            System.out.println("Level 4,above agency-normalized standards");
        }
        else if(per>=70 && per<=79){
            System.out.println("Level 3,at agency-normalized standards");
        }
        else if(per>=60 && per<=69){
            System.out.println("Level 2,below,but approaching agency-normalized standards");
        }
        else if(per>=50 && per<=59){
            System.out.println("Level 1,well below agency-normalized standards");
        }
        else if(per>=40 && per<=49){
            System.out.println("Level 1,too below agency-normalized standards");
        }
        else if(per<=39){
            System.out.println("Remedial standards");
        }

    }
}

