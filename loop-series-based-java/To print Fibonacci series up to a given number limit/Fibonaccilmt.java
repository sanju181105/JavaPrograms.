import java.util.Scanner;
public class Fibonaccilmt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0,b=1,x=0;
        while(a<n){
            System.out.print(a+" ");
            x=a+b;
            a=b;
            b=x;
        }
    }
}