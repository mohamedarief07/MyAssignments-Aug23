package week3.day1;

public class OnePlus implements Android {

	public static void main(String[] args) {
		OnePlus obj =new OnePlus();
		obj.openApp();
		obj.playVideo();

	}

	@Override
	public void openApp() {
		System.out.println("Open an App");
		
	}

	@Override
	public void playVideo() {
		System.out.println("Watch Video");
		
	}

}
