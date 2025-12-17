import java.util.Scanner;
public class Automorphic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int square = n * n;
        int temp = n;
        int power = 1;
        while (temp > 0) {
            power *= 10;
            temp /= 10;
        }
          if (square % power == n)
            System.out.println("automorphic");
        else
            System.out.println("no");
    }
}
