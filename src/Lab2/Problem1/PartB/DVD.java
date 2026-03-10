package Lab2.Problem1.PartB;

public class DVD extends LibraryItem {
    private int durationInMinutes;

    public DVD(String title, String author, int year, int duration) {
        super(title, author, year);
        this.durationInMinutes = duration;
    }

    // getter
    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    // setter
    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    public String getItemType() {
        return "DVD";
    }
}
