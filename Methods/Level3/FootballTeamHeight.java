package Methods.Level3;

import java.util.Arrays;

public class FootballTeamHeight {

    public static int[] generateRandomHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + (int)(Math.random() * 101); // 150 to 250
        }
        return heights;
    }
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }
    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateRandomHeights(11);

        System.out.println("Player Heights (in cm): " + Arrays.toString(heights));

        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("\n--- Team Height Stats ---");
        System.out.println("Total Height: " + sum + " cm");
        System.out.printf("Average Height: %.2f cm\n", mean);
        System.out.println("Shortest Player Height: " + shortest + " cm");
        System.out.println("Tallest Player Height: " + tallest + " cm");
    }
}

