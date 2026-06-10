package Lambda_Streams.Streaming.TerminalOps;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectEx1 {
	
	  public static void main(String[] args) {
	    List<String> names = Employee.getPersons()
	        .stream()
	        .map(Employee::getName)
	        //.collect(ArrayList::new,  ArrayList::add, ArrayList::addAll);
	        .collect(Collectors.toList());
	   // System.out.println(names);

		Map<String, List<Employee>> empMap = Employee.getPersons()
				.stream().collect(Collectors.groupingBy(Employee::getDesig));

		  //Employee.getPersons().stream().map(Employee::getName).collect(Collectors.partitioningBy(Employee::getGender));
		
		Set<String> keySet = empMap.keySet();
		for(String desig:keySet) {
			System.out.println("\nDesig :"+ desig);
			List<Employee> empList = empMap.get(desig);
			empList.stream().forEach(e-> System.out.print(e.getName()+" "));
		}
				

	  }
	}

	class Employee {
	  public static enum Gender {
	    MALE, FEMALE
	  }

	  private long id;
	  private String name;
	  private Gender gender;
	  private LocalDate dob;
	  private double income;

	  private String desig;

	  public Employee(long id, String name, Gender gender, LocalDate dob,
	      double income,String desig) {
	    this.id = id;
	    this.name = name;
	    this.gender = gender;
	    this.dob = dob;
	    this.income = income;
		this.desig = desig;
	  }
	  public String getGender() {
		  return gender.toString();
	  }
	  public String getName() {
	    return name;
	  }
	  public String getDesig() { return desig; }

	  public static List<Employee> getPersons() {
	    Employee p1 = new Employee(1, "Jake", Gender.MALE, LocalDate.of(1971,
	        Month.JANUARY, 1), 2343.0,"Supervisor");
	    Employee p2 = new Employee(2, "Jack", Gender.MALE, LocalDate.of(1972,
	        Month.JULY, 21), 7100.0, "Manager");
	    Employee p3 = new Employee(3, "Jane", Gender.FEMALE, LocalDate.of(1973,
	        Month.MAY, 29), 5455.0,"Supervisor");
	    Employee p4 = new Employee(4, "Jode", Gender.MALE, LocalDate.of(1974,
	        Month.OCTOBER, 16), 1800.0, "Manager");
	    Employee p5 = new Employee(5, "Jeny", Gender.FEMALE, LocalDate.of(1975,
	        Month.DECEMBER, 13), 1234.0, "Employee");
	    Employee p6 = new Employee(6, "Jason", Gender.MALE, LocalDate.of(1976,
	        Month.JUNE, 9), 3211.0,"Supervisor");

	    List<Employee> persons = Arrays.asList(p1, p2, p3, p4, p5, p6);

	    return persons;
	  }

	

}
