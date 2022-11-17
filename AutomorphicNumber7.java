import java.util.Scanner;

public class AutomorphicNumber7
{
    public static int countDigits(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }
    public static int reverse(int n){
        int rev=0;
        while(n>0){
            rev=(n%10)+(rev*10);
            n/=10;
        }
        return rev;
    }


    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int sq=n*n;
        System.out.println(sq);
        int numberoFDigits=countDigits(n);
        System.out.println(numberoFDigits);
        int number=0;
        while(numberoFDigits>0){
          int lastDigit=sq%10;
          number=lastDigit+number*10;
          numberoFDigits--;
          sq=sq/10;
        }
        int reversed=reverse(number);
        System.out.println(reversed==n);
    }

}
