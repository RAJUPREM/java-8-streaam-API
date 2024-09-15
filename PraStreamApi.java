package NewStreamPractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PraStreamApi {
	
	public static void main(String [] args)
	{
		List<Employee> lemployees=new ArrayList<Employee>();
		lemployees.add(new Employee(11,"Raju Kumar Sharma","8210574728",30,85604,"Application Engineer","Male",2022));
		lemployees.add(new Employee(1,"Prem Kumar","8210574728",30,185604,"Senior Application Engineer","Male",2022));
		lemployees.add(new Employee(12,"Nandani","9528151825",21,845604,"Application Developer","FeMale",2024));
		lemployees.add(new Employee(5,"Nandani Sharma","9528151825",21,875604,"Go Lang Engineer","FeMale",2024));
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
		
		lemployees.stream().filter(PraStreamApi::even).forEach(System.out::println);
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		lemployees.stream().filter(emp->emp.getEmployeeId()%2==0).forEach(i->System.out.println(i));
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		//lemployees.stream().sorted().forEach(i->System.out.println(i));
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		lemployees.stream().sorted(Comparator.comparing(Employee::getEmployeeId)).forEach(i->System.out.println(i));
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		lemployees.stream().sorted(Comparator.comparing(Employee::getEmployeeName)).forEach(i->System.out.println(i));
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		lemployees.stream().sorted(Comparator.comparing(Employee::getEmployeeName).reversed()).forEach(i->System.out.println(i));
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		lemployees.stream().sorted((emp1,emp2)->emp1.getEmployeeId()-emp2.getEmployeeId()).forEach(i->System.out.println(i));
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		lemployees.stream().sorted((emp1,emp2)->emp1.getEmployeeName().compareTo(emp2.getEmployeeName())).forEach(i->System.out.println(i));
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		lemployees.stream().sorted((emp1,emp2)->emp2.getEmployeeId()-emp1.getEmployeeId()).forEach(i->System.out.println(i));
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		lemployees.stream().sorted((emp1,emp2)->emp2.getEmployeeName().compareTo(emp1.getEmployeeName())).forEach(i->System.out.println(i));
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		lemployees.stream().sorted((emp1,emp2)->{
			
			if(emp1.getEmployeeId()>emp2.getEmployeeId())
			{
				return -1;
			}
			else
			{
				return 1;
			}
			
		}).forEach(i->System.out.println(i));
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
			lemployees.stream().sorted((emp1,emp2)->{
			
			if(emp1.getEmployeeId()>emp2.getEmployeeId())
			{
				return 1;
			}
			else
			{
				return -1;
			}
			
		}).forEach(i->System.out.println(i));
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		Map<String,Long> mgender=lemployees.stream().collect(Collectors.groupingBy(Employee::getEmployeeGender,Collectors.counting()));
		mgender.entrySet().stream().forEach(System.out::println);
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		lemployees.stream().map(emp->emp.getEmployeeRole()).forEach(i->System.out.println(i));
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		lemployees.stream().map(emp->emp.getEmployeeRole()).distinct().forEach(i->System.out.println(i));
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		Map<String,Double> ma=lemployees.stream().collect(Collectors.groupingBy(Employee::getEmployeeGender,Collectors.averagingInt(Employee::getEmployeeAge)));
		ma.entrySet().stream().forEach(System.out::println);
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		Employee e=lemployees.stream().sorted(Comparator.comparing(Employee::getEmployeeSalary).reversed()).findFirst().get();
		System.out.println(e);
		
		Employee eAnother=lemployees.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getEmployeeSalary))).get();
		System.out.println(eAnother);
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		List<String> lempAfter=lemployees.stream().filter(emp->emp.getEmployeeJoined()>2023).map(emp->emp.getEmployeeName()).collect(Collectors.toList());
		lempAfter.forEach(System.out::println);
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		Map<String,Long> mr=lemployees.stream().collect(Collectors.groupingBy(Employee::getEmployeeRole,Collectors.counting()));
		mr.entrySet().stream().forEach(System.out::println);
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		Map<String,Double> mas=lemployees.stream().collect(Collectors.groupingBy(Employee::getEmployeeRole,Collectors.averagingDouble(Employee::getEmployeeSalary)));
		mas.entrySet().stream().forEach(i->System.out.println(i));
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		Employee eyme=lemployees.stream().filter(emp->emp.getEmployeeGender().equals("Male")).sorted((emp1,emp2)->emp1.getEmployeeAge()-emp2.getEmployeeAge()).findFirst().get();
		System.out.println(eyme);
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		Map<String,Long> mg=lemployees.stream().filter(emp->emp.getEmployeeRole().equals("Go Lang Engineer")).collect(Collectors.groupingBy(Employee::getEmployeeGender,Collectors.counting()));
		mg.entrySet().stream().forEach(System.out::println);
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		Map<String,Double> mss=lemployees.stream().collect(Collectors.groupingBy(Employee::getEmployeeGender,Collectors.averagingDouble(Employee::getEmployeeSalary)));
		mss.entrySet().stream().forEach(System.out::println);
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		Map<String,List<Employee>> mnr=lemployees.stream().collect(Collectors.groupingBy(Employee::getEmployeeRole,Collectors.toList()));
		for(Map.Entry<String,List<Employee>> temp:mnr.entrySet())
		{
			System.out.println(temp.getKey()+" - "+temp.getValue());
		}
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		
		System.out.println("-------------------------------------------------------------------------------------------");
	}
	
	public static boolean even(Employee emp)
	{
		if(emp.getEmployeeId()%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
