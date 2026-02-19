import java.util.Scanner;

public class checking_of_seqence {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number sequence : ");
        int num  = sc.nextInt();

        boolean ans = false;

        while (num >9) {
            int last = num % 10;
            int prev = (num%100)/10;
            if ( prev+1 == last || prev-1 == last)
                ans = true;
                
            else{
                ans = false;
                break;
            }
            num = num/10;
}
if(ans)
    System.out.println("Yes");
else
    System.out.println("No");

sc.close();

            
        }
    }
    

