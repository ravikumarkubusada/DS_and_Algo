/**
 * 
 */
package stack.palindrome_challenge;

import java.util.Stack;

/**
 * @author Ravikumar Kubusada
 *
 */
public class ParenthesisChecker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int j = 1;  j< args.length; j++) {
			
			String input = args[j];
			Stack<Character> stack = new Stack<Character>();
			for (int i = 0; i < input.length(); i++) {
				char ch = input.charAt(i);

				if (ch == '[' || ch == '(' || ch == '{') {
					stack.push(ch);
				} else if ((ch == ']' || ch == ')' || ch == '}') && (!stack.isEmpty())) {
					if (((char) stack.peek() == '(' && ch == ')') || ((char) stack.peek() == '{' && ch == '}')
							|| ((char) stack.peek() == '[' && ch == ']')) {
						stack.pop();
					} else {
						System.out.println("not balanced");
					}
				}
			}

			if (stack.empty())
				System.out.println("balanced");
			else
				System.out.println("not balanced");

		}
	}

}
