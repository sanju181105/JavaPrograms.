import java.util.Scanner;

public class Powtwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0;
        for(int i=1;i<=n;i++){
            a=(int)Math.pow(2,i);
            if(a>n){
                break;
            }
            else{
                System.out.print(a+" ");
            }
        }
    }
}
