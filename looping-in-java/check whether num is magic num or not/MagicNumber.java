import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num;
        int sum = 0;
        while (num > 0) {
            sum = sum + (num % 10);
            num = num / 10;
        }
        int rev = 0;
        int temp = sum;
        while (temp > 0) {
            rev = rev * 10 + (temp % 10);
            temp = temp / 10;
        }
        if (sum * rev == n) {
            System.out.println( "Magic Number");
        } else {
            System.out.println( " not Magic Number");
        }

    }
}
