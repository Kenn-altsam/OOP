package Lab1.Problem4;

import java.util.ArrayList;

public class Course {
    private String name;
    private String description;
    private int credits;
    private ArrayList<String> prerequisites;

    public Course(String name, String description, int credits, ArrayList<String> prerequisites) {
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.prerequisites = (prerequisites == null) ? new ArrayList<>() : new ArrayList<>(prerequisites);
    }

    public Course(String name, String description, int credits) {
        this(name, description, credits, new ArrayList<>());
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return name + "Course{name='" + name + "', description='" + description + "', credits='" + credits + ", prerequisites=" + prerequisites + "}";
    }
}
