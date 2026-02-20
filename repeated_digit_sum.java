import java.util.Scanner;

public class repeated_digit_sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        while (num > 9) {          // single digit varra varaikum
            int sum = 0;

            while (num > 0) {      // digits add pannradhu
                sum = sum + (num % 10);
                num = num / 10;
            }

            num = sum;             // next round ku
        }

        System.out.println("Single digit sum: " + num);
        sc.close();
    }
}


