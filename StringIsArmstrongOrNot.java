package EXTRA;

import java.util.Scanner;

public class StringIsArmstrongOrNot {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            if (isPalindrome(input)) {
                System.out.println("The given string is a palindrome.");
            } else {
                System.out.println("The given string is not a palindrome.");
            }

            scanner.close();
        }

        private static boolean isPalindrome(String str) {
            String cleanStr = str.replaceAll("\\s", "").toLowerCase();

            int length = cleanStr.length();
            for (int i = 0; i < length / 2; i++) {
                if (cleanStr.charAt(i) != cleanStr.charAt(length - i - 1)) {
                    return false;
                }
            }
            return true;
        }
    }

