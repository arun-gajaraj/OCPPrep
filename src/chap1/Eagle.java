package chap1;

public class Eagle implements Fly{

	@Override
	public int getWingSpan() {
		return 100;
	}

	@Override
	public void land() {
		System.out.println("Animal is landing");
		
	}

	public static void main(String[] args) {
		
		Fly fly = new Eagle();
		fly.land();
		
	}
}
