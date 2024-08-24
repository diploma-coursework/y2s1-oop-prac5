import java.util.HashMap;
import java.util.Scanner;

public class Q1 {
    static char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        HashMap<Character, Integer> result = countVowels(word);

        System.out.printf("The word '%s' contains:\n", word);
        for (char vowel : vowels) {
            System.out.printf("%c: %d\n", vowel, result.get(vowel));
        }
    }

    public static HashMap<Character, Integer> countVowels(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char vowel : vowels) {
            map.put(vowel, 0);
        }

        for (char character : str.toLowerCase().toCharArray()) {
            if (map.containsKey(character)) {
                map.put(character, map.get(character) + 1);
            }
        }

        return map;
    }
}
