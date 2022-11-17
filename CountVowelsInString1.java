import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountVowelsInString1
{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter string");
        String s=scanner.nextLine();
        System.out.println();
        s=s.toLowerCase();
        System.out.println("s= "+s);
        List<Character> characterList=new ArrayList<>();
        characterList.add('a');
        characterList.add('e');
        characterList.add('i');
        characterList.add('o');
        characterList.add('u');
        int vowelCount=0;
        int c=0;
        for(int i=0;i<s.length();i++){
            if(characterList.contains(s.charAt(i))){
                vowelCount++;
            }
            else if (s.charAt(i)>'a'&&s.charAt(i)<'z') {
                c++;
            }
        }
        System.out.println("total characters in string are "+s.length());
        System.out.println("total consonants are "+c);
        System.out.println("total vowels are "+vowelCount);
    }
}
