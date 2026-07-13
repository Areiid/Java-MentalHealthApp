public class moodentry {
    private String mood;
    private int stressLevel;
    private String note;

    public moodentry(String mood, int stressLevel, String note) {
        this.mood = mood;
        this.stressLevel = stressLevel;
        this.note = note;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public int getStressLevel() {
        return stressLevel;
    }

    public void setStressLevel(int stressLevel) {
        this.stressLevel = stressLevel;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void displayEntry() {
        System.out.println("Mood: " + mood);
        System.out.println("Stress Level: " + stressLevel + "/10");
        System.out.println("Note: " + note);
        System.out.println("----------------------------");
    }
}

