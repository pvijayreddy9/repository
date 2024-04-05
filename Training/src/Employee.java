import java.util.Comparator;

public class Employee{

	private int id;
	private String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	public static Comparator<Employee> nameComparator = new Comparator<Employee>() {
		
		@Override
		public int compare(Employee e1, Employee e2) {
			
			if(e1.getName().compareTo(e2.getName())>0)
				return 1;
			else
				return -1;		
		}
	};
	
	
	
	
	
	
	
	
}
