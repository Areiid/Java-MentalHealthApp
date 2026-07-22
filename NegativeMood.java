public class NegativeMood extends MoodEntry {

    public NegativeMood(String mood, String note) {
        super(mood, note);
    }

    @Override
    public void displayInfo() {
        System.out.println("Negative mood recorded.");
    }
}
