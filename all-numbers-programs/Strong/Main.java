import java.util.*;
public class Main{
    public  static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int temp=n;
        while(temp>0){
            int d=temp%10;
            int fact=1;
            for(int i=1;i<=d;i++){
                fact*=i;
            }
            sum=sum+fact;
            temp/=10;
        }
        if(sum==n){
            System.out.print("Strong");
        }
        else{
            System.out.print("No");
        }
    }
}