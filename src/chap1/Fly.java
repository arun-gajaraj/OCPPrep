package chap1;

public interface Fly {

	public int MAX_SPEED = 100;

	public int getWingSpan() throws Exception;

	public default void land() {

		System.out.println("Animal is landing in Interface !");
	}

	public static double calculateSpeed(double distance, double time) {
		return distance / time;
	}
}
