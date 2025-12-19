import java.util.*;
public class Main{
    public  static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       // int temp=n;
        if (n%7==0||n%10==7){
            System.out.print("Buzz");
        } 
        else{
            System.out.print("No");
        }
    }
}