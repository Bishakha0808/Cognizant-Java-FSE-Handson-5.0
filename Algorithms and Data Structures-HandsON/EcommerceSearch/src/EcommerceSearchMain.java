import java.util.Arrays;

public class EcommerceSearchMain {
    public static void main(String[] args) {
        // Step 2: Setup
        Product[] products = {
            new Product("P005", "Laptop", "Electronics"),
            new Product("P001", "Smartphone", "Electronics"),
            new Product("P003", "Tablet", "Electronics"),
            new Product("P004", "Headphones", "Accessories"),
            new Product("P002", "Monitor", "Electronics")
        };

        String targetId = "P003";

        System.out.println("=== E-commerce Platform Search Function ===\n");

        // Step 3: Implementation - Linear Search
        System.out.println("--- Linear Search ---");
        Product resultLinear = SearchAlgorithms.linearSearch(products, targetId);
        if (resultLinear != null) {
            System.out.println("Found: " + resultLinear);
        } else {
            System.out.println("Product not found.");
        }

        // Step 3: Implementation - Binary Search
        System.out.println("\n--- Binary Search ---");
        // Sort before Binary Search
        Arrays.sort(products); 
        System.out.println("(Array sorted by Product ID)");
        
        Product resultBinary = SearchAlgorithms.binarySearch(products, targetId);
        if (resultBinary != null) {
            System.out.println("Found: " + resultBinary);
        } else {
            System.out.println("Product not found.");
        }

        // Step 1 & 4: Outputting Analysis
        System.out.println("\n=== Analysis & Big O Notation ===");
        System.out.println("1. Big O Notation:");
        System.out.println("   Big O notation is a mathematical notation that describes the limiting behavior of a function.");
        System.out.println("   In algorithms, it classifies algorithms according to how their run time or space requirements grow as the input size grows.");
        
        System.out.println("\n2. Linear Search Complexity:");
        System.out.println("   - Best Case: O(1) (Target is the first element)");
        System.out.println("   - Average Case: O(n)");
        System.out.println("   - Worst Case: O(n) (Target is the last element or not present)");
        
        System.out.println("\n3. Binary Search Complexity:");
        System.out.println("   - Best Case: O(1) (Target is the middle element)");
        System.out.println("   - Average Case: O(log n)");
        System.out.println("   - Worst Case: O(log n) (Target is at the extremes or not present)");
        
        System.out.println("\n4. Comparison & Suitability:");
        System.out.println("   - Binary Search is vastly superior to Linear Search for searching large datasets because O(log n) grows much slower than O(n).");
        System.out.println("   - However, Binary Search requires the array to be sorted, which has a cost of O(n log n).");
        System.out.println("   - For an e-commerce platform where users search for products frequently, Binary Search is much more suitable.");
        System.out.println("   - We can sort the products array once (or maintain a sorted state/use database indexes) and then serve millions of blazing fast O(log n) searches.");
    }
}
