import java.util.ArrayList;
import java.util.Scanner;

public class MentalHealthApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<moodentry> moodEntries = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== Mental Health Tracker =====");
            System.out.println("1. Add Mood Entry");
            System.out.println("2. Display Mood Entries");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {

                System.out.print("How are you feeling today? ");
                String mood = input.nextLine();

                System.out.print("Enter your stress level from 1 to 10: ");
                int stressLevel = input.nextInt();
                input.nextLine();

                System.out.print("Enter a short note about your day: ");
                String note = input.nextLine();

                moodentry newEntry =
                        new moodentry(mood, stressLevel, note);

                moodEntries.add(newEntry);

                System.out.println("Your mood entry was added.");

            } else if (choice == 2) {

                if (moodEntries.isEmpty()) {
                    System.out.println("No mood entries have been saved.");
                } else {
                    System.out.println("\n===== Saved Mood Entries =====");

                    for (moodentry entry : moodEntries) {
                        entry.displayEntry();
                    }
                }

            } else if (choice == 3) {

                System.out.println("Thank you for using the Mental Health Tracker.");

            } else {

                System.out.println("Invalid option. Please try again.");
            }

        } while (choice != 3);

        input.close();
    }
}