import java.util.Scanner;

public class PalindromeOrNot2
{
    public static boolean checkPalindrome(String n){
        String rev="";
        for(int i=n.length()-1;i>=0;i--){
            rev =rev+n.charAt(i);
        }
        System.out.println(rev);
        return rev.equals(n);
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String n=scanner.nextLine();
        System.out.println(checkPalindrome(n));
    }

}
