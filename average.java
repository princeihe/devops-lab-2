public class AverageMinMax {
    public static void main(String[] args) {
        float a = 5;
        float b = 2;
        float c = 39;
        float average;
        float smallest;
        float largest;

        // Calculate the average
        average = (a + b + c) / 3;

        // Find the smallest value
        smallest = Math.min(a, Math.min(b, c));

        // Find the largest value
        largest = Math.max(a, Math.max(b, c));

        System.out.println("Average: " + average);
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
}
