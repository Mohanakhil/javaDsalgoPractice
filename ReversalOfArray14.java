import java.util.Scanner;

public class ReversalOfArray14
{
    public static void printArray(int[] a){
        System.out.println();
        for(int ele:a){
            System.out.print(ele+" ");
        }
    }
    public static int[] reverseArray(int[] a){
        int first=0,last=a.length-1;
        while(first<last){
            int temp=a[first];
            a[first]=a[last];
            a[last]=temp;
            first++;
            last--;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]= scanner.nextInt();
        }
        printArray(a);
        a=reverseArray(a);
        printArray(a);
    }
}
