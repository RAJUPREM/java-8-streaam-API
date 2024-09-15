package NewStreamPractice;

public class Employee {
	
	
	public Employee(int employeeId, String employeeName, String employeeMobile, int employeeAge, int employeeSalary,
			String employeeRole, String employeeGender, int employeeJoined) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeMobile = employeeMobile;
		this.employeeAge = employeeAge;
		this.employeeSalary = employeeSalary;
		this.employeeRole = employeeRole;
		this.employeeGender = employeeGender;
		this.employeeJoined = employeeJoined;
	}
	public Employee() {
		super();
	}
	
	private int employeeId;
	private String employeeName;
	private String employeeMobile;
	private int employeeAge;
	private int employeeSalary;
	private String employeeRole;
	private String employeeGender;
	private int employeeJoined;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeMobile() {
		return employeeMobile;
	}
	public void setEmployeeMobile(String employeeMobile) {
		this.employeeMobile = employeeMobile;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getEmployeeRole() {
		return employeeRole;
	}
	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}
	public String getEmployeeGender() {
		return employeeGender;
	}
	public void setEmployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}
	public int getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
	public int getEmployeeJoined() {
		return employeeJoined;
	}
	public void setEmployeeJoined(int employeeJoined) {
		this.employeeJoined = employeeJoined;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeMobile="
				+ employeeMobile + ", employeeAge=" + employeeAge + ", employeeSalary=" + employeeSalary
				+ ", employeeRole=" + employeeRole + ", employeeGender=" + employeeGender + ", employeeJoined="
				+ employeeJoined + "]";
	}
	
	
	
	

}
