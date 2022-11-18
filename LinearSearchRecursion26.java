import java.util.Scanner;

public class LinearSearchRecursion26
{
    public static void printArray(int[] a){
        for(int ele:a){
            System.out.print(ele+" ");
        }
    }
    public static int linearSearchRecursively(int[] a,int size,int x){
        if(size==0)
            return -1;
        if(a[size-1]==x)
            return size-1;
        return linearSearchRecursively(a,size-1,x);
    }


    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]= scanner.nextInt();
        }
        printArray(a);
        int x= scanner.nextInt();
        System.out.println("index = "+linearSearchRecursively(a,a.length,x));
    }
}
