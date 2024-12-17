public class findStringPalindrome {

    public static boolean palindrome(String str) {
        char[] stringChar = str.toCharArray();
        int end = stringChar.length - 1;
        for (char c : stringChar){
            if (stringChar[end] != c){
                return false;
            }
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "madam";
        String wow = "wow";
        String noon = "NooN";
        String eyob = "eyob";
        String number = "10101";
        int numbers = 10101;

        System.out.println(palindrome(str));
        System.out.println(palindrome(wow));
        System.out.println(palindrome(noon));
        System.out.println(palindrome(eyob));
        System.out.println(palindrome(number));

        System.out.println(palindrome(String.valueOf(numbers)));
    }
}
