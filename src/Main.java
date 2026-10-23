import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        System.out.print(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        boolean isPalind=true;
        String s=x+"";
        for(int i=1;i<=s.length()/2;i++){
            if(s.charAt(i-1)!=s.charAt(s.length()-i)) {
                isPalind=false;
                break;
            }
        }
        return isPalind;
    }
}
