package Task_01_Correction;

public class Correction {
    public static void main(String[] args) {
        String[] words = {"brange", "plum", "tomato", "onibn", "grape"};

        correctWords(words);

        printResult(words);
    }


    private static void correctWords(String[] words) {
        for (int i = 0; i < words.length; i++) {
            words [i] = words[i].replace("b","o");
        }
    }


    private static void printResult(String[] words) {
        for (int i = 0; i < words.length; i++) {
            System.out.println((i + 1) + ") " + words[i]);
        }
    }
}
