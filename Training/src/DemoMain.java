import com.sample.training.day2.ImmutableClass;
import com.sample.training.exception.Person;

public class DemoMain {

	public static void main(String[] args) {
//		DemoImmutableClass dIm = new DemoImmutableClass(new Person("Ramu", 28, "Hyd", 60000),"Employee");
//		Person p = dIm.getP1();
//		System.out.println(dIm.getP1().getName());
//		p.setName("Raju");
//		System.out.println(dIm.getP1().getName());
		DemoSingleTon singleton = DemoSingleTon.getInstance();
		DemoSingleTon singleton1 = DemoSingleTon.getInstance();
		System.out.println(singleton.hashCode());
		System.out.println(singleton1.hashCode());
		
		
	}

}
