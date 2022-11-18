import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch27
{
    public static void printArray(int[] a){
        for(int ele:a){
            System.out.print(ele+" ");
        }
    }
    public static int binarySearch(int[] a,int x){
        Arrays.sort(a);
        int left=0,right=a.length-1;
        while(left<=right){
            int mid=(left+(right-left)/2);
            if(a[mid]==x){
                return mid;
            }
            if(x<a[mid]){
              right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
      return -1;
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
        System.out.println("index ="+binarySearch(a,x));
    }
}
