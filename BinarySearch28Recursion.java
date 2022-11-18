import java.util.Scanner;

public class BinarySearch28Recursion
{
    public static int binarySearch(int[] a,int left,int right,int ele){
        if(left>right)
            return -1;
        int mid=(left)+(right-left)/2;
        if(a[mid]==ele)
            return mid;
        if(ele>a[mid])
            return binarySearch(a,mid+1,right,ele);
        else
            return binarySearch(a,left,mid-1,ele);
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]= scanner.nextInt();
        }
        int x= scanner.nextInt();
        System.out.println("index= "+binarySearch(a,0,a.length,x));
    }
}
