import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        System.out.println(addTwoDigits(48));

        System.out.println(largestNumber(2));

        System.out.println(firstNotRepeatingCharacter("abacabaabacaba"));
    }

    // First
    private static int addTwoDigits(int n) {
        return n / 10 + n % 10;
    }

    // Second
    private static int largestNumber(int n) {
        return (int) (Math.pow(10, n) - 1);
    }

    // Third
    private static char firstNotRepeatingCharacter(String s) {
        HashMap<Character, Integer> scoreboard = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (scoreboard.containsKey(c)) {
                scoreboard.put(c, scoreboard.get(c) + 1);
            } else {
                scoreboard.put(c, 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (scoreboard.get(c) == 1) {
                return c;
            }
        }

        return ' ';
    }

}
