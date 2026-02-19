import java.util.Scanner;
class order_of_sequence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number sequence");
         int num = sc.nextInt();
         boolean asc = true;
         boolean des = true;
         while(num > 9 ){
            int last = num%10;
            int prev = (num%100) / 10;

            if(prev > last)
                asc = false;
            else if(prev < last)
                des = false;
            else{
                asc =false;
                des = false;
            }

            num = num /10;
}
        if(asc)
            System.out.println("THey are in Ascending order");
        else if(des)
            System.out.println("They are in Descending order");
        else
            System.out.println("They are no in order");
            
        sc.close();
            
         }

    }
