import java.util.Scanner;


public class SumOfNumbersAToBRecursion15
{
    public static int sumFromAtoB(int a,int b){
        if(a>=b){
            return a;
        }
        return a+sumFromAtoB(a+1,b);
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        System.out.println(sumFromAtoB(a,b));
    }
}
