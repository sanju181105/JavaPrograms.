import java.util.Scanner;
public class Perfectnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0;
        for(int j=1;j<=n;j++){
            for(int i=1;i<=j/2;i++){
            if(j%i==0){
                a+=i;
            }
            }
            if(a==j){
                System.out.print(a+" ");
            }
            a=0;
        }
    }
}