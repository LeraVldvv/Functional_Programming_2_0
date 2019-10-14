public class Solution {
    private static boolean isPalindrome;

    public static  void recursion(char[] a, int index) {
         if (a.length % 2 == 0) {
             if (index < (a.length / 2)) {
                 if (a[index] == a[a.length - index - 1]) {
                     isPalindrome=true;
                     recursion(a, index + 1);
                 } else {
                     isPalindrome = false;
                 }
             }
         }else{
             if (index < ((a.length-1) / 2)) {
                 if (a[index] == a[a.length - index - 1]) {
                     isPalindrome=true;
                     recursion(a, index + 1);
                 } else {
                      isPalindrome= false;
                 }
             }else if(index==(a.length-1) / 2){}
         }
     }

      public static void toLowerCaseMethod( char[]array,int index){
        if(index<array.length-1) {
            array[index]=Character.toLowerCase(array[index]);
             toLowerCaseMethod(array,index+1);
        }

      }
        static boolean palindrome(String s) {
         char[] charArray=  s.toCharArray();
         int startFromDigit=0;
         toLowerCaseMethod(charArray,startFromDigit);
         recursion(charArray,startFromDigit);
         return isPalindrome;
        }

    public static void main(String[] args) {
     System.out.println(  palindrome("Abba"));

    }
}
