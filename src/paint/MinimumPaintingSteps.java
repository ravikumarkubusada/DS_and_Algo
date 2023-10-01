package paint;

import java.util.Arrays;

import java.util.Arrays;

import java.util.Arrays;

import java.util.Arrays;

public class MinimumPaintingSteps {

    public static int minPaintingSteps(int[] floors) {
        int targetFloor = floors.length - 1; // The last index of the array is the target floor
        int[] dp = new int[targetFloor + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[0] = 0; // Base case

        for (int i = 1; i <= targetFloor; i++) {
            if (floors[i] == 1) { // Check if the floor is painted (1)
                for (int j = 1; j <= i; j++) {
                    if (dp[i - j] != Integer.MAX_VALUE) {
                        dp[i] = Math.min(dp[i], dp[i - j] + 1);
                    }
                }
            }
        }

        return dp[targetFloor] == Integer.MAX_VALUE ? -1 : dp[targetFloor];
    }

    public static void main(String[] args) {
        int[] paintedFloors = {0, 1, 0, 1, 0, 1};
        int minSteps = minPaintingSteps(paintedFloors);

        if (minSteps != -1) {
            System.out.println("Minimum steps to paint the house is: " + minSteps);
        } else {
            System.out.println("It's not possible to paint the house");
        }
    }
}


