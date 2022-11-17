import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber9
{
    public static int numbersquaresum(int n){
        int sum=0;
        while(n>0){
        sum= (int) (sum+Math.pow(n%10,2));
        n/=10;
        }
        return sum;
    }
    public static  boolean isHappy(int n){
        Set<Integer> s=new HashSet<>();
        int sum=0;
        while (true){
            int sqsum=numbersquaresum(n);
            if(sqsum==1)
                return true;
            if(s.contains(sqsum))
               return false;
            s.add(sqsum);
            n=sqsum;
    }}


    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
            int n= scanner.nextInt();
            System.out.println(isHappy(n));

        }
}
