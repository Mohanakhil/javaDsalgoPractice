import java.util.Scanner;

public class EvenOdd
{
    public void checkEvenOdd(int n){
        if(n%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        EvenOdd evenOdd=new EvenOdd();
        evenOdd.checkEvenOdd(n);
    }

}
