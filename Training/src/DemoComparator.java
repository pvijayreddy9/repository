import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import java.util.stream.Collectors;

public class DemoComparator {

	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(new Employee(1, "Swetha"),new Employee(2, "Ramu"),new Employee(3, "Arun")
				,new Employee(4, "Arjun"),new Employee(5, "Bhanu"));
		List<Employee> empSortedList = empList.stream().sorted(Employee.nameComparator).collect(Collectors.toList());
		empList.stream().filter(x->x.getName().toLowerCase()
				.startsWith("a")).forEach(a->{System.out.println(a);});
		System.out.println(empSortedList);
		

	}

}
