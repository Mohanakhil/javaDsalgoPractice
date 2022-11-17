import java.util.Scanner;

public class InsertIntoArrayAtAnyPosition11
{
    public static void printArray(int[] a){
        for(int ele:a){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter index to enter ");
            int index= scanner.nextInt();
            System.out.println("enter ele");
            int ele= scanner.nextInt();
            a[index]=ele;
        }
        printArray(a);

    }
}
