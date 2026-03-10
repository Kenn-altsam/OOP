package Lab2.Problem1.PartB;

public class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String title, String author, int year, int issueNumber) {
        super(title, author, year);
        this.issueNumber = issueNumber;
    }

    // getter
    public int getIssueNumber() {
        return issueNumber;
    }

    // setter
    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public String getItemType() {
        return "Magazine";
    }
}
