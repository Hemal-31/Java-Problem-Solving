public class palidorme {
    public static void main(String[] args) {
        // String str = "madam";

        // String rev = "";

        // for (int i = str.length() - 1; i >= 0; i--) {
        //     rev += str.charAt(i);

        // }

        // if (str.equals(rev)) {
        //     System.out.println("THe string is an palindrome");
        // } else {
        //     System.out.println("The String is not an palindrome");
        // }
    

    // for number based
int n = 1001;
int original = n;   // save original
int reverse = 0;

while (n > 0) {
    int digit = n % 10;
    reverse = reverse * 10 + digit;
    n = n / 10;
}

if (original == reverse) {
    System.out.println("Palindrome");
} else {
    System.out.println("Not a Palindrome ");
}


}
}