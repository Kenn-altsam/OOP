package Lab2.Problem5;

public class PhDStudent extends Person {
    private String major;
    private String researchTopic;
    private int publicationCount;

    public PhDStudent(String name, int age, String major, String researchTopic) {
        super(name, age);
        this.major = major;
        this.researchTopic = researchTopic;
        this.publicationCount = 0;
    }

    @Override
    public void assignPet(Animal pet) {
        if (pet instanceof Dog) {
            System.out.println("PhD students cannot have dogs — too busy with research!");
            return;
        }
        super.assignPet(pet);
    }

    public String getMajor() { return major; }
    public String getResearchTopic() { return researchTopic; }
    public int getPublicationCount() { return publicationCount; }

    public void publishPaper() {
        publicationCount++;
    }

    @Override
    public String getOccupation() {
        return "PhD Student (" + major + " - " + researchTopic + ")";
    }
}