import com.sample.training.exception.Person;

public final class DemoImmutableClass {
	private final Person p1;
	private final String s1;
	
	 public DemoImmutableClass(Person p,String s2) {
		this.p1 = new Person(p.getName(), p.getAge(), p.getAddress(), p.getSalary());
		this.s1 = s2;
	}

	public Person getP1() {
		return new Person(p1.getName(), p1.getAge(), p1.getAddress(), p1.getSalary());
	}

	public String getS1() {
		return s1;
	}
	 
	
}
