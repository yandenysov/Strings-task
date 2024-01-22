package Task_03_NameSurfer;

import java.util.Scanner;

public class NameSurfer {
    public static void main(String[] args) {
        System.out.println("This program browses a list of names to print amount of coincidences with your input.");

        String[] names = {"Bob", "Alice", "Tom", "Lucy", "Bob", "Lisa"};
        Scanner scanner = new Scanner(System.in);
        boolean continueBrowsing = true;

        while (continueBrowsing) {
            System.out.println("Please, enter the name you would like to browse for: ");
            String name = scanner.next();
            name = manageNameLetterCases(name);

            int matchesAmount = countNameMatches(names, name);

            printResult(name, matchesAmount);

            System.out.println("Would you like to enter another name (Y/N): ");
            String continueConfirmation = scanner.next();
            if (continueConfirmation.equalsIgnoreCase("n")) continueBrowsing = false;
        }

        System.out.println("Thank you for using Namesurfer!");
    }

    private static String manageNameLetterCases(String input) {
        return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
    }

    private static int countNameMatches(String[] names, String targetName) {
        int counter = 0;

        for (String name : names) {
            if (name.equalsIgnoreCase(targetName)) {
                counter++;
            }
        }

        return counter;
    }

    private static void printResult(String name, int matchesAmount) {
        if (matchesAmount > 0) {
            System.out.println("Name " + name + " is encountered in the list " + matchesAmount + " time(-s)");
        }
        else System.out.println("Name " + name + " is not present in the list");
    }
}
