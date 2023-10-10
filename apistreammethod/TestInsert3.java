package allprograms.apistreammethod;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestInsert3 {

	public static void main(String[] args) {
		List<Customer> list=new ArrayList<>();
		list.add(new Customer(1,"Legan","lee@gmail.com"));
		list.add(new Customer(2,"chinni","chinni@gmail.com"));
		list.add(new Customer(7,"jay","jay@gmail.com"));
		list.add(new Customer(4,"krishna","krishna@gmail.com"));
		list.add(new Customer(3,"madhu","madhu@gmail.com"));
		list.add(new Customer(6,"chandu","chandu@gmail.com"));
		list.add(new Customer(5,"priya","priya@gmail.com"));
		
//		List<Customer> list2=list.stream().filter(e->e.getName().startsWith("c")).collect(Collectors.toList());
//		List<Customer> list2=list.stream().filter(e->e.getId()==2).collect(Collectors.toList());
		List<Customer> list2=list.stream().filter(e->e.getEmail().startsWith("k")).collect(Collectors.toList());
		for(Customer c :list2) {
			System.out.println(c);
		}
	}

}
