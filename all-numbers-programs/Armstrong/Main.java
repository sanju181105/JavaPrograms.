import java.util.*;
public class Main{
    public  static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int temp=n;
        while(temp>0){
            int d=temp%10;
            sum+=d*d*d;
            temp/=10;
        }
        if(sum==n){
            System.out.print("Armstrong number");
        }
        else{
            System.out.print("Not armstrong");
        }
    }
}