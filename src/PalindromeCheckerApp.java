public class PalindromeCheckerApp {
    public static void main(String[] args) {

                // Original String
                String word = "radar";

                // Convert String to Character Array
                char[] characters = word.toCharArray();

                // Two-pointer approach
                int start = 0;
                int end = characters.length - 1;

                boolean isPalindrome = true;

                while (start < end) {

                    if (characters[start] != characters[end]) {
                        isPalindrome = false;
                        break;
                    }

                    start++;
                    end--;
                }

                // Display Result
                if (isPalindrome) {
                    System.out.println("The given string \"" + word + "\" is a Palindrome.");
                } else {
                    System.out.println("The given string \"" + word + "\" is NOT a Palindrome.");
                }
            }
        }


