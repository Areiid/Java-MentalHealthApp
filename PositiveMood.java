public class PositiveMood extends MoodEntry {

    public PositiveMood(String mood, String note) {
        super(mood, note);
    }

    @Override
    public void displayInfo() {
        System.out.println("Positive mood recorded!");
    }
}
