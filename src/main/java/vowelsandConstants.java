
//Count Vowels and consonants from a word

import java.util.Scanner;

public class vowelsandConstants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        int num_vowels = 0;
        int num_consonants = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = Character.toLowerCase(word.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                num_vowels++;
            } else if (Character.isLetter(ch)) {
                num_consonants++;
            }
        }

        System.out.println("Vowel: " + num_vowels);
        System.out.println("Consonant: " + num_consonants);
    }
}
