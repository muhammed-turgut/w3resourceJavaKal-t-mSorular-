package Ornek4;

class Employee{
	private int salary;
	
	public Employee(int salary) {
		this.salary=salary;
	}
	void work() {
		System.out.println("Working as an employee!");
	}
	
	public int getSalary(){
		return salary;
	}
	
}
class HRManager extends Employee{
	public HRManager(int salary) {
		super(salary);
	}
	
	public void addEmployee() {
		System.out.println("\n Adding new employee!");
	}
	@Override
	public void work() {
		
		System.out.println("\n Managing employess!");
		
	}
}

public class Main {
	public static void main(String[] args) {
		Employee emp=new Employee(70000);
		HRManager hrm=new HRManager(12000);
		
		emp.work();
		System.out.println("Employee salary: "+emp.getSalary());
		 hrm.work();
		 System.out.println("Manager salary: "+hrm.getSalary());
		 hrm.addEmployee();
		
	}

}
