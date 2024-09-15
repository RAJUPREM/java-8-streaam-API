package NewStreamPractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamNewPractice {
	
	public static void main(String [] args)
	{
		Animal ani=(km)->{ int v=100;
		
		v+=km;
		return v;};
		
		System.out.println(ani.running(200));
		
		
		String s="rajuPremRajuprem";
		
		Stream.of(s.split("")).filter(x->x.contains("r")).forEach(i->System.out.println(i));
		
		Map<Object,Long> mp=Stream.of(s.split("")).collect(Collectors.groupingBy(x->x,Collectors.counting()));
		
		for(Map.Entry<Object, Long> t:mp.entrySet())
		{
			System.out.println(t.getKey()+" -- "+t.getValue());
		}
		
		List<Integer> lnumbers=new ArrayList<Integer>();
		
		lnumbers.add(2);
		lnumbers.add(2);
		lnumbers.add(21);
		lnumbers.add(22);
		lnumbers.add(22);
		lnumbers.add(12);
		lnumbers.add(25);
		lnumbers.add(29);
		lnumbers.add(1);
		
		ArrayList<String> li=new ArrayList<String>();
		
		li.add("Nandani");
		li.add("Sharma");
		li.add("Loves");
		li.add("Raju");
		li.add("Kumar");
		li.add("Sharma");
		
		
		lnumbers.stream().distinct().filter(i->i>15).sorted().forEach(i->System.out.println(i));
		
		List<Integer> sortedList=lnumbers.stream().distinct().filter(i->i>15).sorted().collect(Collectors.toList());
		
		
		lnumbers.stream().distinct().filter(i->i>15).sorted(Comparator.reverseOrder()).forEach(i->System.out.println(i));
		
		li.stream().distinct().sorted(Comparator.comparing(String::length)).forEach(i->System.out.println(i));
		
		
		List<Employee> lemployees=new ArrayList<Employee>();
		lemployees.add(new Employee(11,"Raju Kumar Sharma","8210574728",30,85604,"Application Engineer","Male",2022));
		lemployees.add(new Employee(1,"Prem Kumar","8210574728",30,185604,"Senior Application Engineer","Male",2022));
		lemployees.add(new Employee(12,"Nandani","9528151825",21,845604,"Application Developer","FeMale",2024));
		lemployees.add(new Employee(5,"Nandani Sharma","9528151825",21,875604,"Test Engineer","FeMale",2024));
		lemployees.add(new Employee(7,"Ravi Bandhu","8210574728",28,815604,"Go Lang Engineer","Male",2023));
		lemployees.add(new Employee(112,"Ravi Raj","8210574728",28,785604,"Go Lang Engineer","Male",2023));
		lemployees.add(new Employee(41,"Ravi Raj Bandhu","8210574728",28,485604,"Go Lang Engineer","Male",2023));
		lemployees.add(new Employee(1784,"Kumar","8210574728",1185604,30,"IAS","Male",2025));
		lemployees.add(new Employee(71,"Kumar Sourabh","8210574728",30,185604,"IFS","Male",2025));
		lemployees.add(new Employee(91,"Kumar Sourabh Anand","8210574728",30,685604,"IAS OFFICER","Male",2025));
		lemployees.add(new Employee(1,"Sanchayeta","8210574728",7885604,25,"Dot Net Developer","FeMale",2023));
		lemployees.add(new Employee(1,"Sanchu","8210574728",25,385604,"Backend Engineer","FeMale",2023));
		lemployees.add(new Employee(145,"Sanchayeta Ghosh","8210574728",25,185604,"Senior Developer","FeMale",2023));
		lemployees.add(new Employee(5021,"Koustav","8210574728",27,985604,"Spring boot Developer","Male",2024));
		lemployees.add(new Employee(741,"Koustav Hazra","8210574728",27,585604,"Backend Engineer","Male",2024));
		lemployees.add(new Employee(331,"Haider Rahman","8210574728",28,7785604,"Sales Person","Male",2022));
		lemployees.add(new Employee(8471,"Afser Ansal","8210574728",24,8585604,"Java Script Developer","Male",2024));
		lemployees.add(new Employee(541,"Mannu Gupta","8210574728",28,9485604,"Mining Sardar","Male",2024));
		lemployees.add(new Employee(111,"Manoranjan","8210574728",28,485604,"Mining Instrutor","Male",2024));
		lemployees.add(new Employee(9741,"Mukesh Kushwaha","8210574728",27,3385604,"Test Engineer Micro-processor","Male",2024));
		
		//int employeeId, String employeeName, String employeeMobile, int employeeSalary,String employeeRole
		
		lemployees.stream().sorted(Comparator.comparing(Employee::getEmployeeId)).forEach(emp->System.out.println(emp));
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		lemployees.stream().sorted(Comparator.comparing(Employee::getEmployeeName)).forEach(emp->System.out.println(emp));
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		lemployees.stream().sorted(Comparator.comparing(Employee::getEmployeeSalary).reversed()).forEach(emp->System.out.println(emp));
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		lemployees.stream().sorted((o1,o2)->o1.getEmployeeName().compareTo(o2.getEmployeeName())).forEach(emp->System.out.println(emp));
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		lemployees.stream().sorted((o1,o2)-> {
		if(o1.getEmployeeSalary()>o2.getEmployeeSalary())	
		{
			return -1;
		}
		else
		{
			return 1;
		}
		}).forEach(emp->System.out.println(emp));
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		lemployees.stream().sorted((o1,o2)->o1.getEmployeeSalary()-o2.getEmployeeSalary()).forEach(emp->System.out.println(emp));
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		lemployees.stream().map(emp->emp.getEmployeeGender()).collect(Collectors.groupingBy(x->x,Collectors.counting())).entrySet().forEach(em->System.out.println(em));;
	}

}
