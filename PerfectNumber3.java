import java.util.Scanner;

public class PerfectNumber3
{
    public static boolean isPerfectNo(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }

        }
        return sum == n;
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(isPerfectNo(n));
    }

}
