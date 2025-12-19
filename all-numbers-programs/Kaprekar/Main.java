import java.util.*;
public class Main{
    public  static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sq=n*n;
        int temp=sq;
        int count=0;
        while(temp>0){
            count++;
            temp/=10;
        }
        int l=sq%100;
        int m=sq/100;
        if(l+m==n){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
    }
}
       