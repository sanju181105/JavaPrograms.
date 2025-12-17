import java.util.Scanner;

public class Perfectsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i*i>n){
                break;
            }
            else{
                System.out.print(i*i);
                System.out.print(" ");
            }
        }
    }
}
