import java.util.*;
public class Task2{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your mark on sub1(outof 100):");
        int mark1=s.nextInt();
        System.out.println("Enter your mark on sub2(out of 100):");
        int mark2=s.nextInt();
        System.out.println("Enter your mark on sub3(outof 100):");
        int mark3=s.nextInt();
        System.out.println("Enter your mark on sub4(outof 100):");
        int mark4=s.nextInt();
        System.out.println("Enter your mark on sub5(outof 100):");
        int mark5=s.nextInt();
        int Total_marks=mark1+mark2+mark3+mark4+mark5;
        int avg=Total_marks/5;
        
        System.out.println("Your Total marks(out of 500):"+Total_marks);
        System.out.println("Your average percentange:"+avg);
        if(avg>=90){
            System.out.println("Grade A");
        }
        else if(avg<=89 && avg>70){
            System.out.println("Grade B");
        }
        else if(avg<=70 && avg>50){
            System.out.println("Grade C");
        }
        else if(avg<=50){
            System.out.println("Grade D");
        }
        else{
            System.out.println("You are fail.");
        }

    }
    
}
