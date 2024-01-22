package Task_02_RemoveOnions;

public class RemoveOnions {
    public static void main(String[] args) {

        String[] words = {"orange", "plum", "tomato", "onion", "grape", "onion"};

        String[] removalResult = removeWord(words, "onion");

        printResult(removalResult);
    }

    private static String[] removeWord(String[] words, String targetWord) {
        StringBuffer sbuffer = new StringBuffer();

        for (String word : words) {
            if (!word.equalsIgnoreCase(targetWord)) {
                sbuffer.append(word).append("\n");
            }
        }

        String bufferedWords = sbuffer.toString().trim();
        return bufferedWords.split("\n");
    }

    private static void printResult(String[] words) {
        for (int i = 0; i < words.length; i++) {
            System.out.println((i + 1) + ") " + words[i]);
        }
    }
}
