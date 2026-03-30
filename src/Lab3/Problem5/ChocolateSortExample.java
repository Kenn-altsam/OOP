package Lab3.Problem5;

public class ChocolateSortExample {
    public static void main(String[] args) {
        System.out.println("===== Sorting Chocolates by Weight =====\n");

        // Create array of chocolates with random weights
        Chocolate[] chocolates = {
                new Chocolate("Snickers", 47.0),
                new Chocolate("Twix", 42.5),
                new Chocolate("Bounty", 56.0),
                new Chocolate("Mars", 45.0),
                new Chocolate("Kit Kat", 41.5),
                new Chocolate("Cadbury", 65.0),
                new Chocolate("Milky Way", 52.7)
        };

        System.out.println("Original order:");
        for (Chocolate c : chocolates) {
            System.out.println("  " + c);
        }

        // Create a copy for merge sort
        Chocolate[] chocolates2 = chocolates.clone();

        System.out.println("\n===== BUBBLE SORT =====");
        Sort.bubbleSort(chocolates);

        System.out.println("After Bubble Sort (ascending by weight):");
        for (Chocolate c : chocolates) {
            System.out.println("  " + c);
        }

        System.out.println("\n===== MERGE SORT =====");
        Sort.mergeSort(chocolates2);

        System.out.println("After Merge Sort (ascending by weight):");
        for (Chocolate c : chocolates2) {
            System.out.println("  " + c);
        }

        System.out.println("\n===== Finding Heaviest and Lightest =====");

        Chocolate heaviest = chocolates[chocolates.length - 1];
        Chocolate lightest = chocolates[0];

        System.out.println("Heaviest: " + heaviest);
        System.out.println("Lightest: " + lightest);
        System.out.println("Difference: " + (heaviest.getWeight() - lightest.getWeight()) + "g");

        System.out.println("\n===== Testing Swap Method =====");

        Chocolate temp1 = chocolates[0];
        Chocolate temp2 = chocolates[chocolates.length - 1];

        System.out.println("Before swap:");
        System.out.println("  First: " + chocolates[0]);
        System.out.println("  Last: " + chocolates[chocolates.length - 1]);

        Sort.swap(chocolates, 0, chocolates.length - 1);

        System.out.println("After swapping first and last:");
        System.out.println("  First: " + chocolates[0]);
        System.out.println("  Last: " + chocolates[chocolates.length - 1]);
    }
}
