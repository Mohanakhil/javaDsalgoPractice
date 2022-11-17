import java.util.Scanner;

public class PrintNTo1BackTracking23
{
    public static void printNTo1BackTrack(int n,int i){
        if(i>n) return;
        else{
            printNTo1BackTrack(n,i+1);
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        printNTo1BackTrack(n,1);
    }
}
