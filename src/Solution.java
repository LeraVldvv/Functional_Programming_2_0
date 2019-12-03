
public class Solution {


    public static  boolean recursion(char[] a, int index) {
        if ((a[index] == a[a.length - index - 1]) && (index < (a.length / 2)) ){
            return recursion(a, index + 1);
        } else if(a[index] != a[a.length - index - 1]){
            return false;
        } return true;
     }
        static boolean palindrome(String s) {
         char[] charArray=s.toCharArray();
         int startFromDigit=0;
         return recursion(charArray,startFromDigit);
        }

    public static void main(String[] args) {
     System.out.println(palindrome(("āl").toLowerCase()));
    }
}
