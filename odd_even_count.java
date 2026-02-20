public class odd_even_count {
    public static void main(String[] args){
        int a = 53467 , even = 0 , odd = 0;
        while(a >0){
            int digit = a % 10;
            if(digit%2 == 0)
                even++;
            else
                odd++;
        a = a/10;
}
    System.out.println("The Even number count is :" +even);
    System.out.println("The odd number count is :" +odd);


        
    }
} 

