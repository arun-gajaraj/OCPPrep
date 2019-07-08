package chap1;

public class Eagle implements Fly {

	@Override
	public int getWingSpan() {
		return 100;
	}

	@Override
	public void land() {
		System.out.println("Animal is landing in Eagle ");

	}

	public static void main(String[] args) {

		Fly fly = new Eagle();
		fly.land();

		double speed = Fly.calculateSpeed(100, 2);
		System.out.println("Speed is " + speed);

		@SuppressWarnings({ "static-access", "unused" })
		int maxSpeed = fly.MAX_SPEED;

		@SuppressWarnings("unused")
		int maxSpeed2 = Fly.MAX_SPEED;

	}

}
