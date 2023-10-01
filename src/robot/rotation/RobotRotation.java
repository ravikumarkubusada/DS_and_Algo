package robot.rotation;

public class RobotRotation {

	// first move

	static void getPosition(String move) {
		int l = move.length();
		int left = 0, right = 0;
		int backward = 0, forward = 0;

		for (int i = 0; i < l; i++) {
			if (move.charAt(i) == 'L')
				left++;

			else if (move.charAt(i) == 'R')
				right++;

			else if (move.charAt(i) == 'B')
				backward++;

			else if (move.charAt(i) == 'F')
				forward++;
		}

		System.out.println("Position of the bot: (" + (forward - backward) + ", " + (left - right) + ")");
	}

	public static void main(String[] args) {
		String move = "LRRBFB";
		getPosition(move);
	}

}
