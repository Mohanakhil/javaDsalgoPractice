import java.util.Scanner;

public class ReverseArrayRecursion18
{
    public static void printArray(int[] a){
        System.out.println();
        for(int ele:a){
            System.out.print(ele+" ");
        }
    }
    public static void reverseUsingRecursion(int[] a,int start,int last){
        if(start==last){
            return;
        }
        else{
            int temp=a[start];
            a[start]=a[last];
            a[last]=temp;
            reverseUsingRecursion(a,start+1,last-1);
        }
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]= scanner.nextInt();
        }
        printArray(a);
        reverseUsingRecursion(a,0,a.length-1);
        printArray(a);
    }
}
