package myName.strings;
import java.util.Scanner;
public class PermutationInString {

    public static boolean isPermutation(String str, String patt){
        int temp[] = new int[26];
        for(int i=0;i<str.length();i++){
            temp[str.charAt(i) - 'a']++;
        }
        for(int i=0;i<=patt.length()-str.length();i++){
            int temp2[] = new int[26];
            for(int j=0;j<str.length();j++){
                temp2[patt.charAt(i+j) - 'a']++;
            }
            boolean flag = true;
            for(int j=0;j<26;j++){
                if(temp[j]!= temp2[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first string");
        String str = sc.nextLine();
        System.out.println("enter the second string");
        String patt = sc.nextLine();
        boolean res = isPermutation(str, patt);
        System.out.println(res);
        sc.close();
    }
}
