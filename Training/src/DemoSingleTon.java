
public class DemoSingleTon {
	private static DemoSingleTon singleTon;
	
	private DemoSingleTon() {
		
	}
	
	public static DemoSingleTon getInstance() {
		return new DemoSingleTon();
	}
}
