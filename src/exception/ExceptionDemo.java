package exception;

public class ExceptionDemo {

	public static void main(String[] args) throws Exception {

		try {
			throw new Exception("A");
		} catch (Exception e) {
			throw new Exception("B");
		} finally {
			throw new Exception("C"); //only this will be throw
		}
	}
}
