package org.example;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0; // Return 0 for an empty string
        }

        String[] tokens = numbers.split(","); // Split the string by commas
        int sum = 0;

        for (String token : tokens) {
            sum += Integer.parseInt(token); // Parse each token to an integer and sum
        }

        return sum;
    }
}
