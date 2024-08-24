import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String sentence = scanner.nextLine();

        System.out.println(processString(sentence));

    }

    public static String processString(String sentence) {
        char[] charArray = sentence.toUpperCase().toCharArray();
        Set<Character> vowels = new HashSet<>(Set.of('A', 'E', 'I', 'O', 'U'));

        for (int i = 0; i < sentence.length(); i++) {
            if (vowels.contains(charArray[i])) {
                charArray[i] = 'x';
            }
        }

        return String.valueOf(charArray);
    }
}
