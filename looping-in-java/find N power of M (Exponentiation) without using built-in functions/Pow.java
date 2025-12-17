import java.util.*;
public class Pow{
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int sum=1;
    for(int i=0;i<m;i++){
        sum*=n;
    }
    System.out.print(sum);
}
}
    