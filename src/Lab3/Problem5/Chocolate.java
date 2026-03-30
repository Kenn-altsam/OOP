package Lab3.Problem5;

class Chocolate implements Comparable<Chocolate> {
    private String name;
    private double weight;  // in grams

    public Chocolate(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    // Compare by weight
    @Override
    public int compareTo(Chocolate other) {
        if (this.weight > other.weight) return 1;
        if (this.weight < other.weight) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return name + " (" + weight + "g)";
    }
}