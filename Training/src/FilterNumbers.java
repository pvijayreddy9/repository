import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterNumbers {

	public static void main(String[] args) {
		List<Integer> strList = Arrays.asList(8,12,56,18,16,43,13);		
		strList.stream().filter(x->String.valueOf(x).startsWith("1")).forEach(n->System.out.println(n));

	}

}
