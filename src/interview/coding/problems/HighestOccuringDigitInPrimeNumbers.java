package interview.coding.problems;

import java.util.HashMap;
import java.util.Map;

public class HighestOccuringDigitInPrimeNumbers {

	public static void main(String[] args) {

		for (int i = 1; i < args.length - 1; i = i + 2) {
			int numFrom = Integer.parseInt(args[i]);
			int numTo = Integer.parseInt(args[i + 1]);
			Map<String, Integer> store = new HashMap<String, Integer>();

			for (int j = numFrom; j < numTo; j++) {

				if (j == 1 || j == 0)
					continue;

				if ((j % 2) == 0)
					continue;
				boolean flag = true;
				for (int k = 2; k <= (j / 2); k++) {
					// condition for nonprime number
					if ((j % k) == 0) {
						flag = true;
						break;
					} else {
						flag = false;
					}
				}
				if (!flag) {
					System.out.println(j + " is prime");
					String[] numbs = String.valueOf(j).split("");
					for (String key : numbs) {
						if (!store.isEmpty() && store.containsKey(key)) {
							int val = store.get(key) + 1;
							store.put(key, val);
						} else {
							store.put(key, 1);
						}
					}

				}
			}
//			print the max num here 
			Map.Entry<String, Integer> maxEntry = store.entrySet().stream().max(Map.Entry.comparingByValue()).get();
			System.out.println("HighestOccuringDigitInPrimeNumbers is: " + maxEntry.getKey());
		}
	}
}
