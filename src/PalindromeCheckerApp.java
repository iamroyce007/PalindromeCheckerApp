public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("-------------------------------------------");
        System.out.println("UC3 - Reverse String Based Palindrome Check");

        String input2 = "madam";
        String reversed = "";

        for (int i = input2.length() - 1; i >= 0; i--) {
            reversed = reversed + input2.charAt(i);
        }

        boolean isPalindrome2 = input2.equals(reversed);

        System.out.println("Input text: " + input2);
        System.out.println("Reversed text: " + reversed);
        System.out.println("Is it a Palindrome? : " + isPalindrome2);

    }
}
