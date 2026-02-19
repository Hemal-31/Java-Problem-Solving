public class number_based_AscendingOrder {
    public static void main(String[] args) {
        int a = 4567;
        boolean answer = true;
        while (a > 0) {
            int last = a%10;
            int pre = (a%100)/10;
            if(pre > last){
                answer = false;
            break;}

            a = a/10;
}
        if(answer)
            System.out.println("They are in Asceding order");
        else
            System.out.println("They are no in Ascending order");            
        }
      
}
